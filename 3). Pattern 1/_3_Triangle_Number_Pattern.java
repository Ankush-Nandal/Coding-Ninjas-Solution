import java.util.Scanner;

public class Triangle_Number_Pattern { // change class-name according to file_name.java or platforms.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // input from user..
        // increasing triangle..
        for (int i = 1, p = 1; i <= n; i++, p++) { // for row..
            for (int j = 1; j <= i; j++) { // for column..
                System.out.print(p + "");
            }
            System.out.println(); // move to next line after print..
        }

    }
}
// Ankush
// Listendude4@gmail.com