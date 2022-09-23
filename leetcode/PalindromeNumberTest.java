package leetcode;

import static leetcode.PalindromeNumber.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

final class PalindromeNumberTest {
    @Test
    @DisplayName("isPalindrome")
    void testIsPalindrome() {
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(-121));
        assertFalse(isPalindrome(10));
    }
}
