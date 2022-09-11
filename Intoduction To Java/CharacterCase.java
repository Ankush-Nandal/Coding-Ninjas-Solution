import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int n = a; // typecasting..

        // condition.
        if (n >= 65 && n <= 90) { // ASCII values for upper-case A-Z(65-90);
            System.out.println("1");
        } else if (n >= 97 && n <= 122) { // ASCII value for lower-case a-z(97-122);
            System.out.println("0"); // lower-case.
        } else {
            System.out.println("-1");
        }
    }
}