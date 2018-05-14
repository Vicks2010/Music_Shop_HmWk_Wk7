import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {

        Sax sax;

        @Before

        public void before (){
            sax = new Sax("Wind", "SingleReed Mouthpiece", "Brass", 245, 300);
        }

        @Test

        public void hasSoundMaker(){
            assertEquals("SingleReed Mouthpiece", sax.getSoundMaker());
        }


}
