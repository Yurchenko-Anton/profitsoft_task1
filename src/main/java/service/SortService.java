package service;

import shape.Shape;

import java.util.*;
import java.util.stream.Collectors;

public class SortService {

    public int[] sort(int[] numbers) {
        return Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }

    public HashMap<String, Integer> sort(HashMap<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new
                ));
    }

    public List<Shape> sort(List<Shape> shapes) {
        return shapes.stream().sorted(Comparator.comparing(Shape::getV)).collect(Collectors.toList());
    }
}
