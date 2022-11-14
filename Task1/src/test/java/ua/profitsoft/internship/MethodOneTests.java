package ua.profitsoft.internship;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ua.profitsoft.internship.MethodOne.sortedInReverseOrderNonNegativeArray;

public class MethodOneTests {
    @Test
    public void testPositiveInputMethodOne(){
        List<Integer> actual = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            actual.add(i+1);
        }

        List<Integer> expected = new ArrayList<>();
        for (int j = 30; j > 0; j--) {
            expected.add(j);
        }

        assertEquals(expected, sortedInReverseOrderNonNegativeArray(actual));
    }

    @Test
    public void testZeroInputMethodOne(){
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            expected.add(0);
        }

        assertEquals(expected, sortedInReverseOrderNonNegativeArray(expected));
    }

    @Test
    public void testNegativeInputMethodOne(){
        List<Integer> actual = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            actual.add(i-10);
        }

        assertEquals(Collections.EMPTY_LIST, sortedInReverseOrderNonNegativeArray(actual));
    }

    @Test
    public void testNullInputMethodOne(){
        assertThrows(RuntimeException.class, () -> sortedInReverseOrderNonNegativeArray(null));
    }
}
