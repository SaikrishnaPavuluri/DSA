class Solution {

    public int[] sortArray(int[] nums) {

        int[] temp = new int[nums.length];

        sort(nums, temp, 0, temp.length-1);

        return nums;

    }



public void sort(int[] nums, int[] temp, int low, int high){

    if(low<high){
      int mid = low+(high-low)/2;
     
     sort(nums,temp,low,mid);
     sort(nums,temp,mid+1,high);

     mergeArray(nums,temp,low,mid,high);

    }
}


public void mergeArray(int[] nums, int[] temp, int low, int mid, int high){

     for(int i=low; i<=high; i++){

      temp[i] = nums[i];

     }

     int i=low; 
     int j=mid+1;
     int k = low;

     

     while(i<=mid && j<=high){

          if(temp[i] <= temp[j]){
             nums[k]=temp[i];
             i++;

          }
          else{
               nums[k]=temp[j];
               j++;
          } 
        k++;

     }
       
     while(i<=mid){
        
        nums[k]= temp[i];
        i++;
        k++;

     }

}}

    // public int[] sortArray(int[] nums) {

    // for(int i=1; i<nums.length; i++){

    // int temp = nums[i];
    // int j= i-1;

    // while(j>=0 && nums[j]>temp){

    // nums[j+1] = nums[j];
    // j=j-1;

    // }
    // nums[j+1] = temp;

    // }

    // return nums;

    // }

    // public int[] sortArray(int[] nums) {

    // // [5,2,3,1]
    // Boolean isSwapped;

    // for (int i = 0; i < nums.length - 1; i++) {

    // isSwapped = false;

    // for (int j = 0; j < nums.length - 1 - i; j++) {

    // if (nums[j] > nums[j + 1]) {
    // int temp = nums[j + 1];
    // nums[j + 1] = nums[j];
    // nums[j] = temp;
    // isSwapped = true;

    // }
    // }

    // if (isSwapped == false) {

    // break;

    // }

    // }

    // return nums;

    // }
