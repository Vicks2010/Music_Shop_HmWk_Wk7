import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before

    public void before (){
        trumpet = new Trumpet("3 Valves");
    }

    @Test

    public void hasSoundMaker(){
        assertEquals("3 Valves", trumpet.getSoundMaker());
    }

}
