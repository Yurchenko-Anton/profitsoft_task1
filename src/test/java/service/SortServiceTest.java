package service;

import arrays.operation.Validate;
import org.junit.jupiter.api.Test;
import shape.Cone;
import shape.Cylinder;
import shape.Shape;
import shape.Square;
import string.operation.FindWordWithSharp;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    static final SortService sortService = new SortService();
    @Test
    void sortArray() {
        int[] numbers = new int[]{1, -3, 4, 5, 6, 2, -10, -5};
        int[] expected = new int[]{6,5,4,2,1};
        assertArrayEquals(expected, sortService.sort(new Validate().validate(numbers)));
    }

    @Test
    void sortHashMap() {
        List<String> strings = new ArrayList<>();
        strings.add("saw #fd #sdf, asd #fd");
        strings.add("saw #fd #sdf, asd #se");
        strings.add("saw #fd #sdf, asd #se");
        strings.add("saw #fd #se, asd #se");
        strings.add("saw #fd #se, asd #se");
        strings.add("saw #fd #se, asd #se");
        strings.add("saw #fd #se, asd #se");
        strings.add("saw #fd #se, asd #ds");
        strings.add("saw #fd #se, asd #sew");
        strings.add("saw #fd #se, asd #sew");
        strings.add("saw #fd #se, asd #sew");
        strings.add("saw #fd #se, asd #sew");
        strings.add("saw #fd #se, asd #see");
        strings.add("saw #fd #se, asd #see");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#fd",14);
        expected.put("#se",13);
        expected.put("#sew",4);
        expected.put("#sdf",3);
        expected.put("#see",2);
        assertEquals(expected, sortService.sort(new FindWordWithSharp().find(strings)));
    }

    @Test
    void sortShape() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5,2));
        shapes.add(new Square(15,6));
        shapes.add(new Cylinder(10,2));
        shapes.add(new Cylinder(20,2));
        shapes.add(new Cone(13,2));
        shapes.add(new Cone(15,2));
        List<Shape> expected = new ArrayList<>();
        expected.add(new Cone(13,2));
        expected.add(new Cone(15,2));
        expected.add(new Square(5,2));
        expected.add(new Cylinder(10,2));
        expected.add(new Cylinder(20,2));
        expected.add(new Square(15,6));

        assertEquals(expected,sortService.sort(shapes));

    }
}