package leetcode;

final class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        var s = new StringBuilder().append(x);
        return s.toString().equals(s.reverse().toString());
    }
}
