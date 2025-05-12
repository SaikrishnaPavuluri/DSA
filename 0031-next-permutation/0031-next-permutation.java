class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int start = n - 2;

        while (start >= 0 && nums[start] >= nums[start + 1]) {

            --start;
        }

        if (start >= 0) {
            int end = n - 1;
            while (end >= 0 && nums[end] <= nums[start]) {

                --end;

            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            reverse(nums, start + 1, n - 1);

        } else {

            reverse(nums, 0, n - 1);
        }

    }

    void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }
}