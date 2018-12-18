public class Billede extends Media {
    private String filtype;
    private int bredde;
    private int længde;
    private String fotograf;


    // getter og setter's for de enkelte variabler
    public String getFiltype() {
        return filtype;
    }

    public void setFiltype(String filtype) {
        this.filtype = filtype;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    @Override
    public void logToConsol() {
        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\n Name is: " + getName() +
                        "\n File created: " + getCreated() +
                        "\n Mediatype is: " + getClass()

        );
    }
}
