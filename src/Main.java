public class Main {

    public static final String SOFTWARE_VERSION = "0.1.0";
    public static final String MEDIA_MAPPE = "media/";

    public static void main(String[] args) {

        // Kører Test klassen og dens metode test, som bliver vist i konsollen
        Test.test();

        MediaManager.logMediaFolder("media");
    }
}

