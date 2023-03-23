import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt(); // Start Fahrenheit value
        int E = s.nextInt(); // End Fahrenheit value
        int W = s.nextInt(); // Step Size
        int fahrenheit; // to put value into it
        // calculate fahrenheit
        while (S <= E) {

            fahrenheit = ((5 * (S - 32)) / 9); // Formula to calculate fahrenheit.
            System.out.println(S + " " + fahrenheit);
            S += W;
        }
    }
}
/*
 * Ankush.
 * contact-listendude4@gmail.com
 */
