public class DivisibleBySeven {

    public static boolean isDivisibleBySeven(int n) {
        
        if (n < 0) {
            return isDivisibleBySeven(-n);
        }

      
        if (n == 0 || n == 7) {
            return true;
        }

        if (n < 10) {
            return false;
        }
        return isDivisibleBySeven((n / 10) - 2 * (n % 10));
    }

    public static void main(String[] args) {
        int input1 = 371;
        int input2 = 14;

        boolean output1 = isDivisibleBySeven(input1);
        boolean output2 = isDivisibleBySeven(input2);

        System.out.println("Is " + input1 + " divisible by 7 " + (output1 ? "Yes" : "No"));
        System.out.println("Is " + input2 + " divisible by 7 " + (output2 ? "Yes" : "No"));
    }
}
