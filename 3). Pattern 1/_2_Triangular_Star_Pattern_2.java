import java.util.Scanner;

public class Triangular_Star_Pattern { // change class-name according to file_name.java
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // input from user
        for (int i = 1; i <= n; i++) { // for row..
            // right-triangle pattern
            for (int j = 1; j <= i; j++) { // for column..
                System.out.print("*");
            }
            System.out.println(); // to move into next line..
        }
    }
}
// Ankush
// contact: Listendude4@gmail.com