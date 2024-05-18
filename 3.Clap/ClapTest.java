import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClapTest {
    @SuppressWarnings("unused")
    private Clap clap;

    @Before
    public void setUp() throws Exception {
        clap = new Clap();
    }

    @Test
    public void testZeroToFourtynineString() {
        assertEquals("Testing 0-49", Clap.clap(0, 49), 
            "Clap! 1 2 3 4 5 6 Clap! 8 9 10 11 12 13 Clap! 15 16 Clap! 18 19 20 Clap!" +
            " 22 23 24 25 26 Clap! Clap! 29 30 31 32 33 34 Clap! 36 Clap! 38 39 40 41 Clap! 43 44 45 46 Clap! 48 Clap! ");
    }

    @Test
    public void testNegativeFourtynineToFortynine() {
        assertEquals("Testing -49 to 49", Clap.countClaps(-49, 49), 19);
    }

    @Test
    public void testBigNumber() {
        assertEquals("Testing 0 to 10,000", Clap.countClaps(0, 10000), 4377);
    }
}
