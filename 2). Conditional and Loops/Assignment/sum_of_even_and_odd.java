import java.util.Scanner;

public class sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int even = 0;
        int odd = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 != 0) {
                odd = odd + digit;
            } else {
                even = even + digit;
            }
        }
        System.out.println(even + " " + odd);
    }
}
// Ankush
// Contact:- listendude4@gmail.com