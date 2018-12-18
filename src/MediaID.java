import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    // sætter latestID til at være 100
    private static int latestId = 100;

    // generer et unikt  assertId
    public static int generate() {

        // opretter et nyt File objekt som hedder file
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        // try catch metode til at fange fejl
        try {

            // hvis filen allerede findes, bliver den nye fils Id sat til at være det samme
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            // den nye filS Id bliver forøget med 1 og bliver derved unikt
            latestId++;

            // opretter en FileWriter som laver latestId om til en String
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

         // fanger invalid input
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        // returner latestId
        return latestId;
    }

}