public class Sax extends Instrumentt{

//    String soundMaker;


    public Sax(String type, String soundMaker, String buildMaterial) {
//        this.soundMaker = soundMaker;
        super(type, soundMaker, buildMaterial);
    }

    public String getSoundMaker() {
        return "Singlereed Mouthpiece";
    }

    public String play(){
        return "Blarrrin";
    }
}

