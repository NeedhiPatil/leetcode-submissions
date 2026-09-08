class Solution {
    public int maxSubArray(int[] nums) {

        int current = nums[0];  // best sum end
        int max = nums[0];      // best sum overall

        for (int i = 1; i < nums.length; i++) {

            // Start new OR continue previous
            current = Math.max(nums[i], current + nums[i]);

            // Update overall best
            max = Math.max(max, current);
        }

        return max;
    }
}