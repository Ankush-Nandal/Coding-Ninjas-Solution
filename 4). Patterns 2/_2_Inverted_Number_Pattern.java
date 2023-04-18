import java.util.Scanner;

public class _2_Inverted_Number_Pattern { // change name _2_Inverted_Number_Pattern to Solution...
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 1. decreasing triangle..
        for (int i = 1, p = n; i <= n; i++, p--) {// for row
            for (int j = i; j <= n; j++) {// for column
                System.out.print(p + "");
            }
            System.out.println();
        }
    }
}
// Ankush..
// Listendude4@gmail.com...