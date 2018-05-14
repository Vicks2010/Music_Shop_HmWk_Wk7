import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

       Guitar guitar;

        @Before

        public void before (){
            guitar = new Guitar("String", "6 Metal Strings", "Wood");
        }

        @Test

        public void hasSoundMaker(){
            assertEquals("6 Metal Strings", guitar.getSoundMaker());
        }

        @Test

        public void canPlay(){
            assertEquals("twang", guitar.play());
        }


}

