import java.util.Scanner;

public class Solution /* _3_Bubble_Sort */ {

    // Function to take array list from user...
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    // function to find the sorted array list...
    public static void bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap...
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // function to print the array list..
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    // main method
    public static void main(String[] args) {
        int[] arr = takeInput();
        int size = arr.length;
        bubbleSort(arr, size);
        printArray(arr);
    }
}
// Ankush
// Listendude4@gmail.com

/*
 * Problem
 * Code Bubble Sort
 * Send Feedback
 * Provided with a random integer array/list(ARR) of size N, you must sort this
 * array using 'Bubble Sort'.
 * Note:
 * Change in the input array/list itself. You don't need to return or print the
 * elements.
 * Example:
 * Input: ‘N’ = 7
 * 'ARR' = [2, 13, 4, 1, 3, 6, 28]
 * 
 * Output: [1 2 3 4 6 13 28]
 * 
 * Explanation: After applying 'bubble sort' on the input array, the output is
 * [1 2 3 4 6 13 28].
 * Input format :
 * The first line contains an integer 'N' representing the size of the
 * array/list.
 * 
 * The second line contains 'N' single space-separated integers representing the
 * elements in the array/list.
 * Output format :
 * You don't need to return anything. In the output, you will see the array
 * after modification is done by you.
 * Constraints :
 * 1 <= N <= 10^3
 * 0 <= ARR[i] <= 10^9
 * Time Limit: 1 sec
 * Sample Input 1:
 * 7
 * 2 13 4 1 3 6 28
 * Sample Output 1:
 * 1 2 3 4 6 13 28
 * Explanation of Sample Output 1:
 * After applying 'bubble sort' on the input array, the output is [1 2 3 4 6 13
 * 28].
 * Sample Input 2:
 * 5
 * 9 3 6 2 0
 * Sample Output 2:
 * 0 2 3 6 9
 * Explanation of Sample Output 2:
 * After applying 'bubble sort' on the input array, the output is [0 2 3 6 9].
 */