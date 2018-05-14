public class Trumpet extends Instrumentt{

//    String soundMaker;


public Trumpet(String type, String soundMaker, String buildMaterial) {
//    this.soundMaker = soundMaker;

    super(type, soundMaker, buildMaterial);
}

    public String getSoundMaker() {
        return "3 Valves";
    }

    public String play(){
        return "Barrrrr";
    }
}


