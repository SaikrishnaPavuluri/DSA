class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] num=new int[2];
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<numbers.length;i++){
            
   
        
        if(!map.containsKey(target-numbers[i])){
            
            map.put(numbers[i],i);
            
        }
            else {
                
                num[1]=i+1;
                
                num[0]=map.get(target-numbers[i])+1;
                
                
               break;
            }
         
            
            
        
        }
        
        return num;
        
        
    }
}