public class LookAndSay {

    public static String findNthTerm(int n) {
        if (n <= 0) {
            return "Invalid input";
        }

        if (n == 1) {
            return "1";
        }

        String prevTerm = "1";

        for (int i = 2; i <= n; i++) {
            prevTerm = generateNextTerm(prevTerm);
        }

        return prevTerm;
    }

    public static String generateNextTerm(String prevTerm) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < prevTerm.length(); i++) {
            if (prevTerm.charAt(i) == prevTerm.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(prevTerm.charAt(i - 1));
                count = 1;
            }
        }

        result.append(count).append(prevTerm.charAt(prevTerm.length() - 1));
        return result.toString();
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;

        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + findNthTerm(n1));

        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + findNthTerm(n2));
    }
}

