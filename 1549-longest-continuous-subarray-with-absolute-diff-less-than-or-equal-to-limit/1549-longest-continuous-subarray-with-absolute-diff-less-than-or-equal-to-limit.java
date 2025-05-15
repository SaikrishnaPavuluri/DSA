class Solution {

    public int longestSubarray(int[] A, int limit) {
    int i = 0, j;
    TreeMap<Integer, Integer> m = new TreeMap<>();
    for (j = 0; j < A.length; j++) {
        m.put(A[j], 1 + m.getOrDefault(A[j], 0));
        if (m.lastEntry().getKey() - m.firstEntry().getKey() > limit) {
            m.put(A[i], m.get(A[i]) - 1);
            if (m.get(A[i]) == 0)
                m.remove(A[i]);
            i++;
        }
    }
    return j - i;
}
    // public int longestSubarray(int[] nums, int limit) {
        
    //     LinkedList<Integer> increase = new LinkedList<>();
    //     LinkedList<Integer> decrease = new LinkedList<>();

    //     int max = 0;
    //     int left = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         int n = nums[i];

    //         while (increase.size() > 0 && n < increase.getLast()) {
    //             increase.removeLast();
    //         }
    //         increase.add(n);

    //         while (decrease.size() > 0 && n > decrease.getLast()) {
    //             decrease.removeLast();
    //         }

    //         decrease.add(n);

    //         while (decrease.getFirst() - increase.getFirst() > limit) {
    //             if (nums[left] == decrease.getFirst()) {
    //                 decrease.removeFirst();
    //             }
    //             if (nums[left] == increase.getFirst()) {
    //                 increase.removeFirst();
    //             }
    //             left++;
    //         }

    //         int size = i - left + 1;
    //         max = Math.max(max, size);
    //     }

    //     return max;
    // }
}
