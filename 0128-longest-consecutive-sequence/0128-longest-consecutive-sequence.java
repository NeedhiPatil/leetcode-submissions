class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;

        int curLength = 1;
        int longest = 1;

        for(int i = 1; i<n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1] + 1){
                curLength++;
            }
            else{
                curLength = 1;
            }

            longest = Math.max(curLength, longest);
        }
        return longest;
    }
}