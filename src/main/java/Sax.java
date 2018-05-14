public class Sax extends Instrumentt{

//    String soundMaker;


    public Sax(String type, String soundMaker, String buildMaterial, int purchasePrice, int salePrice) {
//        this.soundMaker = soundMaker;
        super(type, soundMaker, buildMaterial, purchasePrice, salePrice);
    }

    public String getSoundMaker() {
        return "Singlereed Mouthpiece";
    }

    public String play(){
        return "Blarrrin";
    }
}

