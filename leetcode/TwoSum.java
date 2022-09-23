package leetcode;

final class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        var result = new int[] {};
        loop: for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[] { i, j };
                    break loop;
                }
            }
        }
        return result;
    }
}
