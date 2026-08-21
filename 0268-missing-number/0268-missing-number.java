class Solution {
    public int missingNumber(int[] nums) {

        int len = nums.length;
        int expected = len * (len + 1) / 2;
        int missing = 0;
        int sum = 0;

        for(int i = 0; i < len; i++){
            sum += nums[i];
        }
        missing = expected - sum;
        return missing;
    }
}