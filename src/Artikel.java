public class Artikel extends Media{
    private String forfatter;
    private String artikkeltekst;

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
}
