import java.util.Scanner;

public class _5_Alpha_Pattern { // Change class-name according to file_name.java or platform..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // observe pattern is increasing triangle..
        for (int i = 1, p = 'A'; i <= n; i++, p++) { // for row..
            for (int j = 1; j <= i; j++) { // for column
                System.out.print((char) p + "");
            }
            System.out.println();
        }
    }
}
// Ankush
// listendude4@gmail.com