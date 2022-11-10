package arrays.operation;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    @org.junit.jupiter.api.Test
    void validate() {
        int[] numbers = new int[]{1, -3, 4, 5, 6, 2, -10, -5};
        int[] expected = new int[]{1,4,5,6,2};
        Assertions.assertArrayEquals(expected,new Validate().validate(numbers));
    }
}