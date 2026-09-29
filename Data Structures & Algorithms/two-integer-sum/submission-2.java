class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;

        while(true){
            if(nums[i] + nums[j] != target){
                if(j == nums.length - 1){
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }

            }else return new int[]{i,j};
            
        }
    }
}