public class MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] A) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for (int num : A) {
            totalSum += num;

            
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);
        }

        if (maxSum < 0) {
            return maxSum; 
        }

        
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -5, 4, -3, 1, -3, 4, -1};
        int maxSum = maxSubarraySumCircular(arr);
        System.out.println("Subarray with the largest sum is " + maxSum);
    }
}
