class Solution {
    public int subarraySum(int[] nums, int k) {
 
      int countSubArray = 0;

      int totalCount = 0;

      HashMap<Integer,Integer> map = new HashMap<>();

      map.put(0,1);

      for (int num : nums){
           
           totalCount += num;

           if(map.containsKey(totalCount-k)){

            countSubArray += map.get(totalCount-k);
           
           }

           map.put(totalCount, map.getOrDefault(totalCount,0)+1);




      }

      return countSubArray;
      
    }
 

}