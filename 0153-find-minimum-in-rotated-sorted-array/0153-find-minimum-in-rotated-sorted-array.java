class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int ans = Integer.MAX_VALUE;
        // [7,1,2,3,4,5,6]

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[left] <= nums[mid]) {

                ans = Math.min(ans, nums[left]);

                left = mid + 1;

            }

            else {

                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }

        }
        return ans;

    }
}




// class Solution {
//     public int findMin(int[] nums) {
//         int left = 0;
//         int right = nums.length-1;

//         int mid = 0;

//         while(left < right){
//             mid = left + (right-left)/2;

//             if(nums[mid] > nums[right]){
//                 left = mid+1;
//             }else{
//                 right = mid;
//             }
//         }

//         return nums[left];
//     }
// }


