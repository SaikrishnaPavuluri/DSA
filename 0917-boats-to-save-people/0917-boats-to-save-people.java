import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // 1,2,2,3
        //   ij
        int i=0;
        int j= people.length-1;
        Arrays.sort(people);
        int count = 0;
        while(i<=j){

          if(people[i]+people[j]<=limit){
             
           i++;

          }
          j--;
        count++;


        }

        return count;

}
}