import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0); // take character from user
        int m1 = s.nextInt();
        int m2 = s.nextInt(); // take input from user
        int m3 = s.nextInt();
        int average = (m1 + m2 + m3) / 3; // calculate the average of three number
        System.out.println(a); // print character
        System.out.println(average); // print average
    }
}
// Ankush
// contact:- listendude4@gmail.com