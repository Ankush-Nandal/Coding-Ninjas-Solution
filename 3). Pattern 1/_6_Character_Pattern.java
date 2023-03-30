import java.util.Scanner;

public class _6_Character_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // observe pattern is increasing triangle..
        for (int i = 1, k = 'A'; i <= n; i++, k++) { // for row..
            int p = k;
            for (int j = 1; j <= i; j++) { // for column
                System.out.print((char) p++ + "");
            }
            System.out.println();
        }
    }
}