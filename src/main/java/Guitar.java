public class Guitar extends Instrumentt{

//    String soundMaker;


    public Guitar(String type, String soundMaker, String buildMaterial) {
//        this.soundMaker = soundMaker;
        super(type, soundMaker, buildMaterial);
    }

    public String getSoundMaker() {
        return "6 Metal Strings";
    }

    public String play(){
        return "twang";
    }
}
