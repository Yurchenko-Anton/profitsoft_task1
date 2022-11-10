package string.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordWithSharp {
    public HashMap<String, Integer> find(List<String> strings) {
        List<String> wordWithSharp = new ArrayList<>();
        for (String line : strings) {
            wordWithSharp.addAll(findWithSharp(line.split(" ")));
        }
        return wordWithSharp.stream()
                .collect(HashMap::new, ((map, string) -> {
                    map.merge(string, 1, Integer::sum);
                }), HashMap::putAll);
    }

    private List<String> findWithSharp(String[] strings) {
        return Arrays.stream(strings).filter(s -> s.contains("#")).map(s -> s.replaceAll("[^a-zA-Z#]", "")).distinct().collect(Collectors.toList());
    }
}
