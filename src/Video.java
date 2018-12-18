public class Video extends Media {
    private String filType;
    private int længde;
    private String opløsning;
    private String fotograft;

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

    public String getFotograft() {
        return fotograft;
    }

    public void setFotograft(String fotograft) {
        this.fotograft = fotograft;
    }
}
