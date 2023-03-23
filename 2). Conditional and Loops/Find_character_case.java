import java.util.Scanner;

public class Find_character_case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int n = a;
        if (n >= 97 && n <= 122) {
            System.out.println("0");
        } else if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
