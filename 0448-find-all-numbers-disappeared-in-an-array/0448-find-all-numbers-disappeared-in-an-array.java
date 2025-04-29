class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> result = new ArrayList<>();

        // Mark each number as visited by making the nums[number - 1] negative
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Find all the indices which have positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Numbers not in the array
            }
        }

        return result;
    
    }}


 
