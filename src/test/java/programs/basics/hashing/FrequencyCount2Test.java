package programs.basics.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountElementsTest {

    private CountElements countElements;

    @BeforeEach
    void setUp() {
        countElements = new CountElements();
    }

    @Test
    void testMapElements_WithString() {
        String input = "hello";
        Map<Character, Integer> result = countElements.mapElements(input);

        assertEquals(1, result.get('h'));
        assertEquals(1, result.get('e'));
        assertEquals(2, result.get('l'));
        assertEquals(1, result.get('o'));
        assertEquals(4, result.size());
    }

    @Test
    void testMapElements_WithIntArray() {
        int[] input = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> result = countElements.mapElements(input);

        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
        assertEquals(3, result.size());
    }

    @Test
    void testGetNumber_ExistingElement() {
        int[] input = {5, 5, 6};
        countElements.mapElements(input);

        assertEquals(2, countElements.getNumber(5));
        assertEquals(1, countElements.getNumber(6));
    }

    @Test
    void testGetNumber_NonExistingElement() {
        int[] input = {7, 8, 9};
        countElements.mapElements(input);

        assertEquals(0, countElements.getNumber(10));
    }

    @Test
    void testMapElements_EmptyString() {
        String input = "";
        Map<Character, Integer> result = countElements.mapElements(input);

        assertTrue(result.isEmpty());
    }

    @Test
    void testMapElements_EmptyArray() {
        int[] input = {};
        Map<Integer, Integer> result = countElements.mapElements(input);

        assertTrue(result.isEmpty());
    }
}
