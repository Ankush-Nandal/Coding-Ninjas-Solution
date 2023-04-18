import java.util.Scanner;

public class _3_Sum_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num, i, j;
        for (i = 1; i <= n; i++) {
            num = 1;
            int sum = 0;
            for (j = 1; j <= i; j++) {
                System.out.print(num + "");
                sum = sum + num;
                if (num < i) {
                    System.out.print("+");
                }
                num++;
            }
            System.out.print("=" + sum);
            System.out.println();
        }
    }
}
