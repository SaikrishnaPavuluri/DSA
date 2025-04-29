class Solution {
    public void sortColors(int[] nums) {

        int i = 0;
        int j = 0;
        int k = nums.length - 1;
//     [2,0,2,1,1,0]
        while (j <= k) {

           // Why j < k Fails
           //int[] nums = {2, 0, 1};


            if (nums[j] == 0) {

                swap(i, j, nums);
                i++;
                j++;

            }

            else if (nums[j] == 1) {
                j++;

            }

            else if (nums[j] == 2) {

                swap(j, k, nums);

                k--;

            }

        }

    }

    public void swap(int a, int b, int[] nums) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}