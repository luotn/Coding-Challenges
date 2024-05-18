import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DigitsTest {
    @SuppressWarnings("unused")
    private Digits digits;

    @Before
    public void setUp() throws Exception {
        digits = new Digits();
    }

    @Test
    public void testDupTwoToTwenty() {
        assertEquals("Testing 2-20", Digits.countNoDup(1, 20), 19);
    }

    @Test
    public void testDupNineToNinteen() {
        assertEquals("Testing 9-19", Digits.countNoDup(9, 19), 10);
    }

    @Test
    public void testBigNumber() {
        assertEquals("Testing 0 to 10,000", Digits.countNoDup(0, 10000), 5275);
    }
}
