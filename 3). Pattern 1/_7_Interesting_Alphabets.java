import java.util.Scanner;

public class _7_Interesting_Alphabets { // chanege _7_Interesting_Alphabets to Solution..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // observe pattern is increasing triangle..
        for (int i = 1, k = 'A' + n - 1; i <= n; i++, k--) { // for row..
            int p = k;
            for (int j = 1; j <= i; j++) { // for column
                System.out.print((char) p++ + "");
            }
            System.out.println();
        }
    }
}
// Ankush ..
// listendude4@gmail.com..