class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//[1,2,2,3,3,3]
      Map<Integer, Integer> map = new HashMap<>();

      List<Integer>[] bucket = new ArrayList[nums.length+1];

      
      for(int num : nums){
       
          map.put(num, map.getOrDefault(num,0)+1);
      }

      for(Integer key: map.keySet()){
            
         Integer num = map.get(key);  
         if(bucket[num]==null){

            bucket[num] = new ArrayList<>();

         } 

         bucket[num].add(key);

      }
       int count =0;
       int[] result = new int[k];

      for(int i = bucket.length-1; i>=0 && count < k; i--){


        List<Integer> freqResult = bucket[i];
   
        if(freqResult!=null){
            for(int num : freqResult){
            result[count++]= num;
            }
        }
         


      }

return result;

     

    }
}
