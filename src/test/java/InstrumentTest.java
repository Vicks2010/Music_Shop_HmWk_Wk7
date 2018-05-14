import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Instrument;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before() {
        instrument = new Instrument("Wind","SingleReed Mouthpiece", "Brass");
        }

    @Test
    public void hasType(){
        assertEquals("Wind", instrument.getType());

    @Test
    public void hasSoundMaker();{
            assertEquals("SingleReed Mouthpiece", instrument.getSoundMaker());
        }
    @Test
    public void hasBuildMaterial();{
        assertEquals("Brass", instrument.getBuildMaterial());
            }

    }
