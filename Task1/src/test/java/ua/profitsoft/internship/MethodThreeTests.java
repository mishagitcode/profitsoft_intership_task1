package ua.profitsoft.internship;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ua.profitsoft.internship.MethodThree.sortedThreeDimentionShapes;

public class MethodThreeTests {
    @Test
    public void testPositiveInputMethodThree() {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Cube(10));
        shapes.add(new Sphere(25));
        shapes.add(new Cylinder(30, 35));

        List<Double> expected = new ArrayList<>();
        expected.add(98960.16858807848);
        expected.add(65449.84694978735);
        expected.add(1000.0);

        assertEquals(expected, sortedThreeDimentionShapes(shapes));
    }

    @Test
    public void testNonNegativeInputForCubeMethodThree() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(-5));
    }

    @Test
    public void testNonNegativeInputForSphereMethodThree() {
        assertThrows(IllegalArgumentException.class, () -> new Sphere(-99));
    }

    @Test
    public void testNonNegativeInputForCylinderMethodThree() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(-5, -6));
    }

    @Test
    public void testCollectionNullInputMethodThree() {
        assertThrows(RuntimeException.class, () -> sortedThreeDimentionShapes(null));
    }
}
