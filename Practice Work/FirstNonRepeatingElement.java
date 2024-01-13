import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static int firstNonRepeating(int[] nums) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        for (int num : nums) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, -1, 3, 0};
        int result1 = firstNonRepeating(nums1);
        System.out.println("Output for (-1, 2, -1, 3, 0): " + result1);

        int[] nums2 = {9, 4, 9, 6, 7, 4};
        int result2 = firstNonRepeating(nums2);
        System.out.println("Output for (9, 4, 9, 6, 7, 4): " + result2);
    }
}

