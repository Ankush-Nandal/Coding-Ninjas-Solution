import java.util.Scanner;

public class _1_Mirror_Image_Number_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 1. Decreasing triangle..
        for (int i = 1; i <= n; i++) { // for row
            for (int j = i; j < n; j++) { // for column
                System.out.print(" ");
            }
            // 2. Increasing triangle..
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + "");
            }
            System.out.println();

        }
    }
}
// Ankush
// Listendude4@gmail.com