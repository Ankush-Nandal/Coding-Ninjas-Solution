import java.util.Scanner;

public class _4_Triangle_of_Numbers { // change class name to solution to get output in coding ninja...
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1, k = 1; i <= n; i++, k++) { // for row
            // 1. decreasing triangle..
            int p = k;
            for (int j = i; j <= n; j++) { // for column
                System.out.print(" ");
            }
            // 2. increasing triangle..
            for (int j = 1; j < i; j++) {
                System.out.print(p++ + "");
            }
            // 2. increasing triangle..
            for (int j = 1; j <= i; j++) {
                System.out.print(p-- + "");
            }
            System.out.println();
        }
    }
}
// Ankush
// listendude4@gmail.com