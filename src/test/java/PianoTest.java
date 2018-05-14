import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before

    public void before() {
        piano = new Piano("Percussion", "88 Keys", "Wood", 1125, 2000);
    }

    @Test

    public void hasSoundMaker() {
        assertEquals("88 Keys", piano.getSoundMaker());
    }


    @Test

    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }
}
