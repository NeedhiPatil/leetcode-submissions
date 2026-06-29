class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0, count1 = 0, count2 = 0;

        for(int num : nums){
            if(num == 0)
                count0++;
            else if(num == 1)
                count1++;
            else
                count2++;
        }

        for(int i = 0; i < count0; i++){
            nums[i] = 0;
        }

        for(int j = count0; j < count0 + count1; j++){
            nums[j] = 1;
        }

        for(int k = count0 + count1; k < n; k++){
            nums[k] = 2;
        }
    }
}