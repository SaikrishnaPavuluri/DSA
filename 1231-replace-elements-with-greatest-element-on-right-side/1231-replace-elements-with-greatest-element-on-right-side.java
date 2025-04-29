class Solution {
    public int[] replaceElements(int[] arr) {

        int[] result = new int[arr.length];

        result[arr.length - 1] = -1;

        int max = arr[arr.length - 1];

        for (int j = arr.length - 2; j >= 0; j--) {

            result[j] = max;

            max = Math.max(max, arr[j]);

        }

        return result;

    }
}