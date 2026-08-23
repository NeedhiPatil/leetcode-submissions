class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int target = 0;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {

                int sum = nums[left] + nums[right];

                if (sum == required) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    
                } else if (sum < required) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}