import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

    public static boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; 

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Set<String> wordDict = new HashSet<>();
        wordDict.add("i");
        wordDict.add("like");
        wordDict.add("sam");
        wordDict.add("sung");
        wordDict.add("samsung");
        wordDict.add("mobile");
        wordDict.add("ice");
        wordDict.add("cream");
        wordDict.add("icecream");
        wordDict.add("man");
        wordDict.add("go");
        wordDict.add("mango");

        String input1 = "ilike";
        String input2 = "ilikesamsung";
        String input3 = "i like samsung";
        String input4 = "i like sam sung";

        boolean output1 = wordBreak(input1, wordDict);
        boolean output2 = wordBreak(input2, wordDict);
        boolean output3 = wordBreak(input3, wordDict);
        boolean output4 = wordBreak(input3, wordDict);


        System.out.println("Output for '" + input1 + "': " + (output1 ? "Yes" : "No"));
        System.out.println("Output for '" + input2 + "': " + (output2 ? "Yes" : "No"));
        System.out.println("Output for '" + input3 + "': " + (output3 ? "Yes" : "No"));
        System.out.println("Output for '" + input4 + "': " + (output4 ? "Yes" : "No"));
    }
}