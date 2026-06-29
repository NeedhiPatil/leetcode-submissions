class Solution {
    public int singleNumber(int[] nums) {
        
        int xorVal = 0;

        for(int ele : nums){
            xorVal = xorVal ^ ele;
        }
        return xorVal;
    }
}