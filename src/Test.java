import java.util.ArrayList;

public class Test {


    // Denne metode indeholder kode, som kan vise applikationens funktionalitet (ikke unit test)
    public static void test() {

        // Printer en String ud
        System.out.println("TV2 Media Manager");

        // Opretter et Media objekt som hedder m1 og
        Media m1 = new Media();
        // sætter m1's navn til "Julemanden"
        m1.setName("Julemanden");
        // sætter m1 fileName til "julemand.jpg"
        m1.setFileName("julemand.jpg");

        // kalder toString metoden i som returner m1's assatId, name, created og fileName
        /// og printer det
        System.out.println(m1.toString());

        // Her kommer din kode

    }
}
