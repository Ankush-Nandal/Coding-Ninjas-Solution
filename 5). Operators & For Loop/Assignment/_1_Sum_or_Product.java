import java.util.*;

public class /* Main */ _1_Sum_or_Product {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int i, sum = 0, pro = 1;

        switch (C) {
            case 1:
                for (i = 0; i <= N; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
                break;

            case 2:
                for (i = 1; i <= N; i++) {
                    pro = pro * i;
                }
                System.out.println(pro);
                break;

            default:
                System.out.println(-1);
                break;
        }

    }
}
// Ankush coding ninja