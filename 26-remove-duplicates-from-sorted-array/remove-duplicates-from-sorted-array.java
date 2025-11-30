class Solution {
    //rabhisekkar
    //30nov2025
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){   //for empty array
            return 0;
        }
        int curr = nums[0]; //1st unique element
        int k = 1; //1st unique element count
        for(int i=1; i<nums.length; i++){
            if(nums[i] != curr){
                curr=nums[i]; // found a unique element
                nums[k] = curr; // placing unique element in correct position
                k++;
            }
        }
        return k;
    }
}