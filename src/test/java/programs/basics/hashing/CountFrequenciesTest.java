package programs.basics.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyCounterTest {

    private FrequencyCounter counter;

    @BeforeEach
    void setUp() {
        counter = new FrequencyCounter();
    }

    @Test
    void testFrequencyCount_withValidArray() {
        int[] input = {1, 2, 2, 3, 3, 3};
        List<Integer> expected = Arrays.asList(1, 2, 3, 0, 0, 0);
        List<Integer> result = counter.frequencyCount(input);
        assertEquals(expected, result);
    }

    @Test
    void testFrequencyCount_withOutOfRangeElements() {
        int[] input = {1, 7, 0, -3, 2, 2}; // 7, 0, -3 are out of range for n=6
        List<Integer> expected = Arrays.asList(1, 2, 0, 0, 0, 0);
        List<Integer> result = counter.frequencyCount(input);
        assertEquals(expected, result);
    }

    @Test
    void testFrequencyCount_withEmptyArray() {
        int[] input = {};
        List<Integer> expected = List.of();
        List<Integer> result = counter.frequencyCount(input);
        assertEquals(expected, result);
    }

    @Test
    void testF_withValidArray() {
        int[] input = {1, 2, 2, 3, 3, 3};
        int[] expected = {1, 2, 3, 0, 0, 0};
        int[] result = counter.f(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testF_withOutOfRangeElements() {
        int[] input = {1, 7, 0, -3, 2, 2};
        int[] expected = {1, 2, 0, 0, 0, 0};
        int[] result = counter.f(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testF_withEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = counter.f(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testFind_existingElement() {
        int[] input = {1, 2, 2, 3, 3, 3};
        counter.f(input);
        assertEquals(3, counter.find(3));
    }

    @Test
    void testFind_nonExistingElementInBounds() {
        int[] input = {1, 1, 1};
        counter.f(input);
        assertEquals(0, counter.find(2));
    }

    @Test
    void testFind_withZero() {
        int[] input = {1, 2, 3};
        counter.f(input);
        assertEquals(0, counter.find(0));
    }

    @Test
    void testFind_withNegativeNumber() {
        int[] input = {1, 2, 3};
        counter.f(input);
        assertEquals(0, counter.find(-1));
    }

    @Test
    void testFind_withIndexOutOfBounds() {
        int[] input = {1, 2, 3};
        counter.f(input);
        assertEquals(0, counter.find(10));
    }
}
