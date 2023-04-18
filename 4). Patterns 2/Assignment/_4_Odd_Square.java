import java.util.Scanner;

public class _4_Odd_Square/* Main */ {// change name to Main before submit to coding ninja..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // let n=4;
        int maxOdd = (2 * n) - 1; // (2*4)-1; =(7);
        for (int i = 1; i <= n; i++) { // for row
            // square pattern.
            int odd = 2 * i - 1; // odd=(2*1)-1=1; ,(2*2)-1=3 ,(2*3)-1=5;
            for (int j = 1; j <= n; j++) { // for column
                if (odd > maxOdd) { // odd> 7;
                    odd = 1;
                }
                System.out.print(odd + "");
                odd = odd + 2;
            }
            System.out.println();
        }
    }
}
// Ankush
// Listendude4@gmail.com..