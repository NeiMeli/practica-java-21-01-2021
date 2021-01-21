import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test public void testIsEven() {
        assertTrue(Main.isEven(2));
        assertTrue(Main.isEven(806));
        assertFalse(Main.isEven(3));
        assertFalse(Main.isEven(1897));
    }

    @Test public void testAreEvenDivisable() {
        assertTrue(Main.areEvenDivisible(4, 2));
        assertTrue(Main.areEvenDivisible(5088, 48));
        assertFalse(Main.areEvenDivisible(5, 3));
        assertFalse(Main.areEvenDivisible(1897, 200));
    }

    @Test public void testGetNNumbersThatHasMTimesD() {
        List<Integer> first = Main.getNNumbersThatHasMTimesD(5, 2, 3);
        assertEquals(5, first.size());
        assertTrue(first.containsAll(Arrays.asList(33, 133, 233, 303, 313)));

        List<Integer> second = Main.getNNumbersThatHasMTimesD(7, 2, 2);
        assertEquals(7, second.size());
        assertTrue(second.containsAll(Arrays.asList(22, 122, 202, 212, 220, 221, 222)));
    }
}