package ua.profitsoft.internship;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ua.profitsoft.internship.MethodTwo.countNumberOfHashtags;

public class MethodTwoTests {
    @Test
    public void testPositiveInputMethodTwo() {
        List<String> input = new ArrayList<>();
        input.add("#class    #java #sort sort #sort");
        input.add("class #java #sortsort");
        input.add("#class #java   #java #method #sort sort #method");
        input.add("    #argument #stack #sort");
        input.add("#classsort     #sort");

        List<Map.Entry<String, Integer>> expected = new ArrayList<>();
        expected.add(Map.entry("#sort", 4));
        expected.add(Map.entry("#java", 3));
        expected.add(Map.entry("#class", 2));
        expected.add(Map.entry("#stack", 1));
        expected.add(Map.entry("#classsort", 1));

        assertEquals(expected, countNumberOfHashtags(input));
    }

    @Test
    public void testNullInputMethodTwo() {
        assertThrows(RuntimeException.class, () -> countNumberOfHashtags(null));
    }
}
