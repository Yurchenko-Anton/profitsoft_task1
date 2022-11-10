package string.operation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindWordWithSharpTest {

    @Test
    void find() {
        List<String> strings = new ArrayList<>();
        strings.add("12 #f #f,");
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("#f", 1);
        assertEquals(expected,new FindWordWithSharp().find(strings));
    }
}