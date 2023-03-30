import java.util.Scanner;

public class _4_Reverse_Number_Pattern { // change number according to file_name.java & platform..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // increasing triangle & reverse numbers..
        for (int i = 1, k = 1; i <= n; i++, k++) { // row..
            int p = k;
            for (int j = 1; j <= i; j++) { // column
                System.out.print(p-- + "");
            }
            System.out.println(); // moving to next line..
        }
    }
}
// Ankush
// **Listendude4@gmail.com**..
