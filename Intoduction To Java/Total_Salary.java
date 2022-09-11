import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Basic = s.nextInt();
        char c = s.next().charAt(0);
        int allow;
        if (c == 65) {
            allow = 1700;
        } else if (c == 66) {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double TotalSalary = ((Basic + (0.20 * Basic) + (0.50 * Basic) + allow) - (0.11 * Basic));
        double p = Math.round(TotalSalary);
        int h = (int) (p);
        System.out.println(h);
    }
}
