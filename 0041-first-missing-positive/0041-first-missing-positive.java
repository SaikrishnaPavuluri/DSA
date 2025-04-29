class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i=0;
            while (i<n) {
               int correct = arr[i]-1;
               if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[correct]){
                swap(arr,i,correct);

               }
               else{

                i++;
               }
            }
            for(int index=0; index<arr.length; index++){
                 if(arr[index]!= index+1){
                    return index+1;
                 }

            }
        return n + 1;
    }
    private static void swap(int[] arr, int i, int j){
          int temp= arr[i];
          arr[i] = arr[j];
          arr[j]= temp;

    }
}