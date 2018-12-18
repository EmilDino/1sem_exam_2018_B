public class Artikel extends Media{
    private String forfatter;
    private String artikkeltekst;


    // getter og setter's for de enkelte variabler
    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public String getArtikkeltekst() {
        return artikkeltekst;
    }

    public void setArtikkeltekst(String artikkeltekst) {
        this.artikkeltekst = artikkeltekst;
    }

    @Override
    public void logToConsol() {
        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\n Name is: " + getName() +
                        "\n File created: " + getCreated() +
                        "\n Mediatype is: " + getClass() +
                        "\n Forfatter is: " + getForfatter()

        );
    }
}
