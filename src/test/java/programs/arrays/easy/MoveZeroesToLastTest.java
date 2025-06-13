package programs.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesToLastTest {

    @Test
    public void testMoveZeroesOptimal() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        MoveZeroesToLast.moveZeroes(input);

        assertArrayEquals(expected, input, "The zeroes should be moved to the end optimally.");
    }

    @Test
    public void testMoveZeroesBrute() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        MoveZeroesToLast.moveZeroesBrute(input);

        assertArrayEquals(expected, input, "The zeroes should be moved to the end using brute-force.");
    }

    @Test
    public void testAllZeroes() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};

        MoveZeroesToLast.moveZeroes(input);
        assertArrayEquals(expected, input);

        MoveZeroesToLast.moveZeroesBrute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNoZeroes() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};

        MoveZeroesToLast.moveZeroes(input);
        assertArrayEquals(expected, input);

        MoveZeroesToLast.moveZeroesBrute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlreadyProcessed() {
        int[] input = {1, 2, 3, 0, 0};
        int[] expected = {1, 2, 3, 0, 0};

        MoveZeroesToLast.moveZeroes(input);
        assertArrayEquals(expected, input);

        MoveZeroesToLast.moveZeroesBrute(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testLargeInput() {
        int[] input = new int[100];
        for (int i = 0; i < 50; i++) {
            input[i] = i + 1;
        }
        int[] expected = new int[100];
        for (int i = 0; i < 50; i++) {
            expected[i] = i + 1;
        }

        MoveZeroesToLast.moveZeroes(input);
        assertArrayEquals(expected, input);

        MoveZeroesToLast.moveZeroesBrute(input);
        assertArrayEquals(expected, input);
    }
}
