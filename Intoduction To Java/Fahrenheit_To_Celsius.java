import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt(); // ---> Start Value.
        int E = s.nextInt(); // ---> End value.
        int W = s.nextInt(); // ---> Step Size.
        while (S <= E) {
            int Fah = ((5 * (S - 32)) / 9); // ---> Use formula to calculate fahrenheit to celsius.
            System.out.println(S + " " + Fah);
            S += W;
        }
    }
}
// Ankush-Nandal...
