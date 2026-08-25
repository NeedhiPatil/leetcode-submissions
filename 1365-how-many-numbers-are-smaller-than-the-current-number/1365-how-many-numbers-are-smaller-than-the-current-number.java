class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        int index = 0;

        for(int num : nums) {
            int count = 0;

            for(int i = 0; i < nums.length; i++) {

                if(num > nums[i]) {
                    count++;
                }
            }
            result[index] = count;
            index++;
        }

        return result;
    }
}