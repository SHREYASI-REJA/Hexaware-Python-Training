public class Square {

    public static int minSquares(int n) {
        
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        
        for (int i = 3; i <= n; i++) {
         
            dp[i] = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int input1 = 100;
        int input2 = 6;

        int output1 = minSquares(input1);
        int output2 = minSquares(input2);

        System.out.println("Output for " + input1 + ": " + output1);
        System.out.println("Output for " + input2 + ": " + output2);
    }
}