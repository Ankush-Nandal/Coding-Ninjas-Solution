import java.util.Scanner;

public class _5_Diamond_of_stars { // change class name according to your file_name.java or Solution for
                                   // Coding-Ninja..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // hill pattern..
        int num = (n / 2) + 1;
        int count = num - 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(" ");
            }

            count--;

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        count = 1;

        for (int i = 1; i <= (num - 1); i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(" ");
            }

            count++;

            for (int k = 1; k <= (2 * (num - i)) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

// Ankush
// lsitendude4@gmail.com
