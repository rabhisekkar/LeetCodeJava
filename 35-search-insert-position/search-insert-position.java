class Solution {
    //rabhisekkar
    //01dec2025
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0; i<nums.length && target>nums[i]; i++){
            if(target==nums[i]){
                return i;
            }
        }
        return i;
    }
}