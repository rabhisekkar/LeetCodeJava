class Solution {
    //rabhisekkar
    //02dec2025
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            // if the digit is not 9 then increase and return
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            // if the digit is 9 replace with 0
            // in next iteration the prev element will increase if it's not 9 and return
            // if it's 9 then again replace it with 0 ....
            // 3199 -> 3100(following code) -> 3200(in next iteration)
            digits[i] = 0;
        }
        // if all the elements are 9 then the prev for loop will create a array of 0's
        // 999 -> 000
        // create a new array with increased length and insert 1 in 0th index
        // 000 -> 1000
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}