import java.util.Scanner;

public class _1_Count_Words {
    // Function for count words..
    public static int countWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int space = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                ++space;
            }
        }
        return space + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int output = countWords(str);
        System.out.println(output);
    }
}
