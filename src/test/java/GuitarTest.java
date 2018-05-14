import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

       Guitar guitar;

        @Before

        public void before (){
            guitar = new Guitar("6 Metal Strings");
        }

        @Test

        public void hasSoundMaker(){
            assertEquals("6 Metal Strings", guitar.getSoundMaker());
        }


}
