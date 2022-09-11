import java.util.Scanner;

public class AVerageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // System.out.println("Enter the Character not integer");
        char a = s.next().charAt(0);
      //  System.out.println("Enter 1st Integer");
        int m1 = s.nextInt();
      //  System.out.println("Enter 2st Integer");
        int m2 = s.nextInt();
      //  System.out.println("Enter 3rd Integer");
        int m3 = s.nextInt();
        int Average = (m1 + m2 + m3) / 3;
      //  System.out.println("the Printed Character is => " + a);
         System.out.println(a);
        //System.out.println("The Average of all three numbers are => " + Average);
         System.out.println(Average);
    }
}
