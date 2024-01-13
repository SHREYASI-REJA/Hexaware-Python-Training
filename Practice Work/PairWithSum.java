import java.util.*;

public class PairWithSum {
    public static void findPairWithSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                System.out.println("Pair found (" + complement + ", " + num + ")");
                return;
            }
            numMap.put(num, 1);
        }

        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPairWithSum(nums, target);
    }
}
