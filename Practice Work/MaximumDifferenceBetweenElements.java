public class MaximumDifferenceBetweenElements {
    public static void maxDifference(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Not enough elements in the array");
            return;
        }

        int minElement = nums[0]; 
        int maxDiff = nums[1] - minElement; 
        int start = 0, end = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - minElement > maxDiff) {
                maxDiff = nums[i] - minElement;
                start = minElement;
                end = nums[i];
            }

            if (nums[i] < minElement) {
                minElement = nums[i];
            }
        }

        if (maxDiff > 0) {
            System.out.println("The maximum difference is " + maxDiff + ". The pair is (" + start + ", " + end + ")");
        } else {
            System.out.println("No valid pair found to satisfy the condition");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 5, 1, 3, 5};
        maxDifference(nums);
    }
}
