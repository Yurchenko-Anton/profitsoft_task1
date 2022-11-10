package arrays.operation;

import java.util.Arrays;

public class Validate {
    public int[] validate(int[] numbers) {
        return Arrays.stream(numbers).filter(number -> number >= 0).toArray();
    }
}
