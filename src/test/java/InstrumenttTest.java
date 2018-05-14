import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Instrument;

import static org.junit.Assert.assertEquals;

public class InstrumenttTest {

    Instrumentt instrumentt;
    Guitar guitar;
    Piano piano;
    Sax sax;
    Trumpet trumpet;

//    String type = "Wind";
//    String soundMaker = "SingleReed Mouthpiece";
//    String BuildMaterial = "Brass";

    @Before
    public void before() {
//        instrumentt = new Instrumentt("Wind","SingleReed Mouthpiece", "Brass");
        }

    @Test
    public void hasType(){
        assertEquals("Wind", sax.getType());

//    @Test
//    private void hasSoundMaker();{
//            assertEquals("SingleReed Mouthpiece", sax.getSoundMaker());
//        }
//
//    @Test
//    public void hasBuildMaterial();{
//        assertEquals("Brass", sax.getBuildMaterial());
//        }
    }

    }
