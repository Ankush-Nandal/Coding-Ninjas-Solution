import java.util.*;

public class /* Solution */ _2_All_Prime_Numbers {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        int i, number, count;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (number = 1; number <= n; number++) {
            count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + "\n");
            }
        }

    }
}