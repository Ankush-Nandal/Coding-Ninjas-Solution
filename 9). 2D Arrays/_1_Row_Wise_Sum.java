import java.util.Scanner;

public class /* _1_Row_Wise_Sum */ Solution {
    // function to take 2-D input from user...
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        // taking row from user...
        // System.out.println("Enter row");
        int row = s.nextInt();
        // taking column from user...
        // System.out.println("Enter Columns");
        int cols = s.nextInt();
        // 2-D array declare..
        int[][] arr = new int[row][cols];
        // put the values in every index through iterating all indexes.
        for (int i = 0; i < row; i++) { // for row
            for (int j = 0; j < cols; j++) { // for column
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    // function to find ROW WISE SUM...
    public static void rowWiseSum(int[][] mat) {
        int row = mat.length;
        if (row == 0) {
            return;
        }
        int cols = mat[0].length;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // main-method...
    public static void main(String[] args) {
        int[][] input = takeInput();
        rowWiseSum(input);
    }
}
// Ankush....
// Listendude4@gmail.com
