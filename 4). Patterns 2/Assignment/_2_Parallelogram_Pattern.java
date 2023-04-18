import java.util.Scanner;

public class _2_Parallelogram_Pattern/* Main */ { // change class name to Main before submit the solution..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 1. increasing triangle for space..
        for (int i = 1; i <= n; i++) { // for row
            for (int j = 1; j < i; j++) { // for column
                System.out.print(" ");
            }
            // 2. parallelogram
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
//Ankush
//Listendyde4@gmail.com