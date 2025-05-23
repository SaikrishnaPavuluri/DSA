class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {

            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);

        }

        long boquetsWithFlowers = (long) m*k;

        if (boquetsWithFlowers > bloomDay.length)
            return -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {

                high = mid-1;

            }
            else{

                low = mid+1;
            }
        }
            return low;

    }

    boolean possible(int[] bloomDay, int mid, int m, int k) {

        int noOfBoquets = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {
                count++;
            } else {
                noOfBoquets += count / k;
                count = 0;

            }
        }
        noOfBoquets += count / k;

        return noOfBoquets >= m;

    }
}