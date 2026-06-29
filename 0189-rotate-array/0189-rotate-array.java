class Solution {

    void revArray(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;

        if(n == 0 || k == 0)
        return nums;

        k = k%n;

            revArray(nums, 0, n-1);
            revArray(nums, 0, k-1);
            revArray(nums, k, n-1);

            return nums;

    }
}