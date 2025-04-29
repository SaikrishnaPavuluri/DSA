class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int repeatedNum = 0;
    

        for(int num: nums){
            
            if(count==0){
               
               repeatedNum = num;

            }

            count += (repeatedNum==num)?1:-1;

        }

        return repeatedNum;
        
    }
}