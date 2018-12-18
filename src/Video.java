public class Video extends Media {
    private String filType;
    private int længde;
    private String opløsning;
    private String fotograf;




    public String getFilType() {
        return filType;
    }

    public void setFilType(String filType) {
        this.filType = filType;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public String getOpløsning() {
        return opløsning;
    }

    public void setOpløsning(String opløsning) {
        this.opløsning = opløsning;
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
