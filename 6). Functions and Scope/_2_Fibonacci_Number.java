import java.util.Scanner;

public class /* Solution */ _2_Fibonacci_Number {
    public static boolean checkMember(int n) {
        int a = 0;
        int b = 1;
        int c;
        while (a < n) {
            c = a + b;
            a = b;
            b = c;
        }
        if (a == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(checkMember(n));
    }

}

// Ankush coding-ninja...
// contact: listendude4@gmail.com
