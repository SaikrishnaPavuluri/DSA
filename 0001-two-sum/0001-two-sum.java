import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 22;

        int[] result=twoSum(numbers, target);
        System.out.println("["+result[0]+","+result[1]+"]");

    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (!map.containsKey(target - numbers[i])) {

                map.put(numbers[i], i);
            } else {

                arr[0] = i;
                arr[1] = map.get(target - numbers[i]);
                return arr;
            }

        }

        return arr;
    }

}