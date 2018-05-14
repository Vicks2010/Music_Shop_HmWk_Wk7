public class Instrumentt implements ISell {

    private String type;
    private String soundMaker;
    private String buildMaterial;

    public Instrumentt(String type, String soundMaker, String buildMaterial) {

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

    public int calculateMarkup(){
        this.purchasePrice = purchasePrice;

    }
}
