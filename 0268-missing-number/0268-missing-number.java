

class Solution {
    public int missingNumber(int[] nums) {
      
      
        int l=nums.length;
        int sumOfNums=l*(l+1)/2;
        int tot=sumOfNums;
        
        for(int i=0;i<l;i++){
            
           tot-=nums[i];
            
            
        }
        if(tot==0){
            
            return 0;
        }
        
        
        return tot;
        
        
    } 
}