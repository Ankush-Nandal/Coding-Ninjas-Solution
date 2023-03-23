import java.util.Scanner;
import java.lang.Math;

public class Total_Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        String str = s.next(); // string
        char grade = str.charAt(0); // char type-casting
        int allow;
        if (grade == 65) { // ASCII value for A.
            allow = 1700;
        } else if (grade == 66) { // ASCII value for B.
            allow = 1500;
        } else {
            allow = 1300;
        }
        // implement to formula..

        double totalsalary = ((basic + (0.20 * basic) + (0.50 * basic) + allow) - (0.11 * basic));
        double p = Math.round(totalsalary);
        int h = (int) (p);
        System.out.println(h);

    }
}

/*
 * Ankush
 * COntact: Listendude4@gmail.com
 */
