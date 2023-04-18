import java.util.Scanner;

public class _1_Half_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = (n / 2) + 1; // ie: num=(5/2)+1= 3;
        int count = num - 1; // ie: 3-1;
        // 1. decreasing triangle..
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            } // 2. increasing triangle
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            // 3. increasing triangle..
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower portion..
        for (int i = 1; i <= (num - 1); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 2. decreasing triangle..
            for (int j = 1; j <= (2 * (num - i)) - 1; j++) {
                System.out.print("*");
            }
            // for (int j = i; j < n; j++) {
            // System.out.print("*");
            // }
            // 3. decreasing triangle..
            // for (int j = i; j <= n; j++) {
            // System.out.print("*");
            // }
            System.out.println();
        }
        // count = 1;
        // for (int i = 1; i <= (num - 1); i++) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }

        // // count++;

        // for (int k = 1; k <= (2 * (num - i)) - 1; k++) {
        // System.out.print("*");
        // }

        // System.out.println("");
        // }
    }
}
