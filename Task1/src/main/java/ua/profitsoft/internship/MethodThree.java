package ua.profitsoft.internship;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodThree {
    public static List<Double> sortedThreeDimentionShapes(Collection<Shape> figures) {
        return figures.stream()
                .map(Shape::volume)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
