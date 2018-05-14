public class Instrumentt implements ISell {

    private String type;
    private String soundMaker;
    private String buildMaterial;
    private int purchasePrice;
    private int salePrice;

    public Instrumentt(String type, String soundMaker, String buildMaterial, int purchasePrice, int salePrice) {

        this.type = type;
        this.soundMaker = soundMaker;
        this.buildMaterial = buildMaterial;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return this.type;
    }

    public String getBuildMaterial() {
        return buildMaterial;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int calculateMarkup(){

        if (salesPrice > purchasePrice){
        return "MarkUp is "; {
            salePrice - purchasePrice;
            }
        else "We made a lose";

    }
}


}
