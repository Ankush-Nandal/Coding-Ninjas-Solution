import java.util.*;

public class /* Main */ _5_Decimal_to_Binary {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binaryNum = new int[32];
        int i = 0;
        if (n == 0) {
            System.out.println(0);
        }

        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }

    }
}
// Ankush coding-ninja

/*
 * Problem
 * Decimal to Binary
 * Send Feedback
 * Given a decimal number (integer N), convert it into binary and print.
 * Note: The given input number could be large, so the corresponding binary
 * number can exceed the integer range. So you may want to take the answer as
 * long for CPP and Java.
 * Note for C++ coders: Do not use the inbuilt implementation of "pow" function.
 * The implementation of that function is done for 'double's and it may fail
 * when used for 'int's, 'long's, or 'long long's. Implement your own "pow"
 * function to work for non-float data types.
 * 
 * 
 * Input format :
 * Integer N
 * Output format :
 * Corresponding Binary number (long)
 * Constraints :
 * 0 <= N <= 10^5
 * Sample Input 1 :
 * 12
 * Sample Output 1 :
 * 1100
 * Sample Input 2 :
 * 7
 * Sample Output 2 :
 * 111
 */