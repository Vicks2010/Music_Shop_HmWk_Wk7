import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {

        Sax sax;

        @Before

        public void before (){
            sax = new Sax("SingleReed Mouthpiece");
        }

        @Test

        public void hasSoundMaker(){
            assertEquals("SingleReed Mouthpiece", sax.getSoundMaker());
        }


}
