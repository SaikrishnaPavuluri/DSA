class Solution {

//     public int longestSubarray(int[] A, int limit) {
//     int i = 0, j;
//     TreeMap<Integer, Integer> m = new TreeMap<>();
//     for (j = 0; j < A.length; j++) {
//         m.put(A[j], 1 + m.getOrDefault(A[j], 0));
//         if (m.lastEntry().getKey() - m.firstEntry().getKey() > limit) {
//             m.put(A[i], m.get(A[i]) - 1);
//             if (m.get(A[i]) == 0)
//                 m.remove(A[i]);
//             i++;
//         }
//     }
//     return j - i;
// }
    public int longestSubarray(int[] nums, int limit) {
      //[8,2,4,7]  
        LinkedList<Integer> increase = new LinkedList<>();
        LinkedList<Integer> decrease = new LinkedList<>();

        int max = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];  //8 //2  //4  //7

            while (increase.size() > 0 && n < increase.getLast()) {//  2 < 8
                increase.removeLast();  
            }
            increase.add(n); //8 //2 //2,4,7

            while (decrease.size() > 0 && n > decrease.getLast()) {// 2 > 8//4 > 2
                decrease.removeLast();
            }

            decrease.add(n); //8// 8, 2 // 2 //7
                          //   3 > 7
            while (decrease.getFirst() - increase.getFirst() > limit) { // false// true //false //false
                if (nums[left] == decrease.getFirst()) {
                    decrease.removeFirst(); //2
                }
                if (nums[left] == increase.getFirst()) {
                    increase.removeFirst();  //4,7
                }
                left++;// 2
            }

            int size = i - left + 1;  // 0-0+1// 1-1+1 // 2-1+1=2
            max = Math.max(max, size); // 1 // 1 // 2
        }

        return max;
    }
}
