import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before

    public void before (){
        trumpet = new Trumpet("Wind", "3 Valves", "Brass", 150, 215);
    }

    @Test

    public void hasSoundMaker(){
        assertEquals("3 Valves", trumpet.getSoundMaker());
    }

}
