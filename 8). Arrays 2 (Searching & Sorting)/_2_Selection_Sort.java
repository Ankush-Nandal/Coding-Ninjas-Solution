import java.util.Scanner;

public class Solution/* _2_Selection_Sort */ { // Remove Comment before run in Coding Ninja Solution.
    // function to take array list from user...
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    // Function to print array list...
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    // function to find sorted elements...
    public static void selectionSort(int[] arr, int n) {
        int index;
        for (int i = 0; i < n - 1; i++) {
            index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // Swapping
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    // main method...
    public static void main(String[] args) {
        int[] arr = takeInput();
        int n = arr.length;
        selectionSort(arr, n);
        printArray(arr);
    }
}

// Ankush.
// contact:- Listendue4@gmail.com

/*
 * Problem
 * Selection Sort
 * Send Feedback
 * Provided with a random integer array/list(ARR) of size N, you have been
 * required to sort this array using 'Selection Sort'.
 * Note:
 * Change in the input array/list itself. You don't need to return or print the
 * elements.
 * Input format :
 * First line contains an integer 'N' representing the size of the array/list.
 * 
 * Second line contains 'N' single space separated integers representing the
 * elements in the array/list.
 * Output format :
 * For each test case, print the elements of the array/list in sorted order
 * separated by a single space.
 * 
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * Time Limit: 1 sec
 * Sample Input 1:
 * 7
 * 2 13 4 1 3 6 28
 * Sample Output 1:
 * 1 2 3 4 6 13 28
 * Sample Input 2:
 * 5
 * 9 3 6 2 0
 * Sample Output 2:
 * 0 2 3 6 9
 */