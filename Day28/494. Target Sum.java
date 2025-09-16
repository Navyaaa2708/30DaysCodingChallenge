class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum < Math.abs(target) || (sum + target) % 2 == 1) return 0;
        int s = (sum + target) / 2;
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = s; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[s];
    }
}