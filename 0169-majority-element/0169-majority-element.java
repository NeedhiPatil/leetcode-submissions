class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i<n; i++){
            if(count == 0){
                element = nums[i];
                count++;
            }else {
                if(element == nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }

        count = 0;
        for(int i = 0; i<n;i++){
            if(nums[i] == element){
                count++;
            }
            if(count > (n/2)){
                return element;
            }
        }

        return -1;
    }
}

// HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > n/2){
        //         return entry.getKey();
        //     }
        // }

        // return -1;