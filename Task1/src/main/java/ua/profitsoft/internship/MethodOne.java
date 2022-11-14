package ua.profitsoft.internship;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodOne {

    public static List<Integer> sortedInReverseOrderNonNegativeArray(List<Integer> array) {
        return array.stream()
                .filter(i -> i >= 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
