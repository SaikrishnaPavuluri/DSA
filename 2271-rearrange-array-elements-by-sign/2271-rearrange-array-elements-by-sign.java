class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] res = new int[nums.length];

        int positiveIndx = 0;
        int negativeIndx = 1;

        for(int i=0; i<nums.length; i++){

        if(nums[i] > 0){
        
         res[positiveIndx] = nums[i];
         positiveIndx +=2; 

         }
         else{

            res[negativeIndx] = nums[i];
            negativeIndx += 2;
         }  


        } 
        return res;
        
    }
}
