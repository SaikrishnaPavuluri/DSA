class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);

        while(low<=high){
           
           int mid = low + (high-low)/2;
           int totalH = findMinEatingSpeed(mid,piles);

           if(totalH<=h){
              high = mid-1;

           }
           else{
            low = mid+1;
           }

        }
        return low;
    }

  static int findMinEatingSpeed(int mid, int[] piles){

         int totalH = 0;
        
          for(int i=0; i<piles.length; i++){

            totalH += Math.ceil((double)(piles[i])/(double)(mid));               
            

          }

          return totalH;


   
   }

    
 static int findMax(int[] piles){
      int max = Integer.MIN_VALUE;

      for(int num : piles){
       
       max = Math.max(max, num);

      }    

      return max;

    }


}