import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {

    // opretter fire variabler
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;


    public Media() {
        // sætter assertId til at blive genereret
        assetId = MediaID.generate();
        // objektets created til at være lig med det tidspunkt som man starter programmet
        created = Date.from(Instant.now());
    }

    // getter og setter's for de enkelte variabler
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



    @Override
    public String toString() {
        // returner de nedenstående Strings og variabler
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public void logToConsol() {
        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\n Name is: " + getName() +
                        "\n File created: " + getCreated() +
                        "\n Mediatype is: " + getClass()

        );
    }
}