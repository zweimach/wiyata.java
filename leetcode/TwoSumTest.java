package leetcode;

import static leetcode.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

final class TwoSumTest {
    @Test
    @DisplayName("twoSum")
    void testTwoSum() {
        assertArrayEquals(new int[] { 0, 1 }, twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArrayEquals(new int[] { 1, 2 }, twoSum(new int[] { 3, 2, 4 }, 6));
        assertArrayEquals(new int[] { 0, 1 }, twoSum(new int[] { 3, 3 }, 6));
    }
}
