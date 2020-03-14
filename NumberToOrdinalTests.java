import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class NumberToOrdinalTests {
    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("1st", NumberToOrdinal.numberToOrdinal(1));
        assertEquals("2nd", NumberToOrdinal.numberToOrdinal(2));
        assertEquals("3rd", NumberToOrdinal.numberToOrdinal(3));
    }
}
