import java.util.Scanner;

public class /* Solution */ _1_Nth_Fibonacci_Number { // change name as per the save .java name .
    // recursive function to find fibonacci
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
// Ankush
// listendude4@gmail.com