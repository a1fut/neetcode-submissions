

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            numsSet.add(nums[i]);
        }
        if(nums.length == numsSet.size()) return false;
        else return true;
    }
}