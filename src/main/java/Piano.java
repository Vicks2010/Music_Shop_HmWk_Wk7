public class Piano extends Instrumentt{

//    String soundMaker;


    public Piano(String type, String soundMaker, String buildMaterial, int purchasePrice, int salePrice) {
//        this.soundMaker = soundMaker;
        super(type, soundMaker, buildMaterial, purchasePrice, salePrice);
    }

    public String getSoundMaker() {
        return "88 Keys";
    }

    public String play(){
        return "Plink Plonk";
    }
}
