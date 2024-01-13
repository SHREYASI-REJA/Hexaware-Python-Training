import java.util.Arrays;

public class MinimizeMaxDifference {
    public static void minimizeMaxDifference(int[] heights, int k) {
        int n = heights.length;

        
        Arrays.sort(heights);

       
        int initialMax = heights[n - 1];
        int initialMin = heights[0];


        initialMax -= k;
        initialMin += k;

        if (initialMax < initialMin) {
            int temp = initialMax;
            initialMax = initialMin;
            initialMin = temp;
        }


        for (int i = 1; i < n - 1; i++) {
            int subtract = heights[i] - k;
            int add = heights[i] + k;

            if (subtract >= initialMin || add <= initialMax) {
                continue;
            }

            if (initialMax - subtract <= add - initialMin) {
                initialMin = subtract;
            } else {
                initialMax = add;
            }
        }

        int maxDifference = Math.min(initialMax - initialMin, heights[n - 1] - heights[0]);
        System.out.println("Maximum difference is " + maxDifference);


        System.out.print("arr[] = {");
        for (int i = 0; i < n - 1; i++) {
            if (heights[i] - k >= initialMin) {
                System.out.print(heights[i] - k + ", ");
            } else if (heights[i] + k <= initialMax) {
                System.out.print(heights[i] + k + ", ");
            }
        }
        if (heights[n - 1] - k >= initialMin) {
            System.out.println(heights[n - 1] - k + "}");
        } else if (heights[n - 1] + k <= initialMax) {
            System.out.println(heights[n - 1] + k + "}");
        }
    }

    public static void main(String[] args) {
        int[] heights1 = {1, 15, 10};
        int k1 = 6;
        System.out.println("Input: arr[] = {1, 15, 10} with k = 6");
        minimizeMaxDifference(heights1, k1);

        int[] heights2 = {1, 5, 15, 10};
        int k2 = 3;
        System.out.println("\nInput: arr[] = {1, 5, 15, 10} with k = 3");
        minimizeMaxDifference(heights2, k2);
    }
}

