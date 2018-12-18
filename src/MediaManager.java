import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {

    // Her kommer din kode

    public static void logMediaFolder(String folderNavn) {
        // viser alle filernde fra media mappen
        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
                System.out.println(listOfFiles[i].getName());
        }
    }

    public void readMediaFolder(String folderNavn) {

    }
}
