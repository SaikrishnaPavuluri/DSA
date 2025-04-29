class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {

                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j - 1] == nums[j])
                    continue;
                // if(j>i+1&& nums[j]==nums[j-1]){
                // continue;
                // }

                int k = j + 1;
                int l = nums.length - 1;
                // [-3,-2,-1,0,0,1,2,3]
                // i j k l
                while (k < l) {

                    long sum = nums[i] + nums[j]; 
                    sum+= nums[k] + nums[l];
                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k - 1] == nums[k])
                            k++;

                        while (k < l && nums[l + 1] == nums[l])
                            l--;
                    } else if (sum < target) {

                        k++;

                    } else {

                        l--;
                    }

                }

            }

        }

        return result;
    }
}