import java.util.Scanner;

public class /* Solution */ _3_Arrange_Numbers_In_Array {
    // function to arrange the array list;
    public static void arrange(int[] arr, int n) { // let n=6;
        int left = 0;
        int right = n - 1; // right =5;(1st iteration).
        int counter = 1;
        while (left <= right) { // 0<=6;(true-1st itr)
            if (counter % 2 == 1) { // 1%2==1(true-1st itr)
                arr[left] = counter; // arr[left]=1;
                counter++; // counter =2;
                left++; // left=1; then again start the while loop.
            } else {
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }

    // Function to print array;
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        // ArrangeNumber(arr, n);
        arrange(arr, n);
        printArray(arr);

    }
}
// Ankush
// Listendude4@gmail.com
