public class Guitar extends Instrumentt{

//    String soundMaker;


    public Guitar(String type, String soundMaker, String buildMaterial, int purchasePrice, int salePrice) {
//        this.soundMaker = soundMaker;
        super(type, soundMaker, buildMaterial, purchasePrice, salePrice);
    }

    public String getSoundMaker() {
        return "6 Metal Strings";
    }

    public String play(){
        return "twang";
    }
}
