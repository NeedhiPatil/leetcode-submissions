class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int index = 0;
        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
                nums[index] = n;
                index++;
            }
            
        }
        return index;
    }
}