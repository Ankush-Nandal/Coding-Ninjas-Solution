import java.util.Scanner;

public class _2_String_Palindrome {
    // function for palindrome...
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) { // put a condition which check the loop iterate while both cross each other.
            if (str.charAt(left) != (str.charAt(right))) {
                return false;
            }
            // if the condition is not get true then it will execute line 13 and 14.
            ++left;
            --right;
        }
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isPalindrome(str));
    }
}
// Ankush
// Listendude4@gmail.com