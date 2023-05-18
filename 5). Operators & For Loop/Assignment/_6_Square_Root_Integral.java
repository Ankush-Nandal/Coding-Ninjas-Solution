import java.util.*;

public class /* Main */ _6_Square_Root_Integral {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 0 || x == 1) // if condition
        {
            System.out.println(x);
        } else // else condition
        {
            int i = 1, result = 1;

            while (result <= x) // while loop
            {
                i++; // increment i by 1 (i=i+1)
                result = i * i;
            }

            System.out.println(i - 1);
        }

    }

}
// ANkush coding-ninja

/*
 * Problem
 * Square Root (Integral)
 * Send Feedback
 * Given a number N, find its square root. You need to find and print only the
 * integral part of square root of N.
 * For eg. if number given is 18, answer is 4.
 * Input format :
 * Integer N
 * Output Format :
 * Square root of N (integer part only)
 * Constraints :
 * 0 <= N <= 10^8
 * Sample Input 1 :
 * 10
 * Sample Output 1 :
 * 3
 * Sample Input 2 :
 * 4
 * Sample Output 2 :
 * 2
 */