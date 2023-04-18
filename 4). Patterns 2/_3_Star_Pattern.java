import java.util.Scanner;

public class _3_Star_Pattern { // change class _3_Star_Pattern to Solution..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) { // for row
            // 1. decreasing triangle..
            // for column
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            // 2. increasing triangle..
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            // 3. increasing triangle..
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Ankush
// listendude4@gmail.com