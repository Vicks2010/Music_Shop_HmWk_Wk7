public class Instrument {

    private String type;
    private String soundMaker;
    private String buildMaterial;

    public Instrument(String type, String soundMaker, String buildMaterial) {

        this.type = type;
        this.soundMaker = soundMaker;
        this.buildMaterial = buildMaterial;
    }

    public String getType() {
        return this.type;
    }

    public String getSoundMaker() {
        return soundMaker;
    }

    public String getBuildMaterial() {
        return buildMaterial;
    }
}
