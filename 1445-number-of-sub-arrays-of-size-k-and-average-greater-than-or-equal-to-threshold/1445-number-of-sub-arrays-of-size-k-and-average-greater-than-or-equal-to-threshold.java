
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int prefixSum = 0;
        int count = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (i >= k - 1) { 
                if (prefixSum / k >= threshold) {
                    count++;
                }
                prefixSum -= arr[i - k + 1];
            }
        }

        return count;
    }
}

