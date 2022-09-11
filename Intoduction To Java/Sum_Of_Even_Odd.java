import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int Digit;
        int even = 0, odd = 0;
        while (n > 0) {
            Digit = n % 10;
            n = n / 10;
            if (Digit % 2 != 0)
                odd = odd + Digit;
            else
                even = even + Digit;
        }
        System.out.println(even + " " + odd);

    }
}
// Ankush-Nandal...