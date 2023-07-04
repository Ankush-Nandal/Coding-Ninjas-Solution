import java.util.Scanner;

public class ReverseString {
    // function to print reverse string...
    public static String reverseString(String str) {
        String reversestr = ""; // take an empty string...
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr += str.charAt(i);
        }
        return reversestr;
    }

    // main method..
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String value you want:");
        String str = s.nextLine();
        String output = reverseString(str);
        System.out.println(output);
    }
}
