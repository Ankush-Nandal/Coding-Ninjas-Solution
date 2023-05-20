import java.util.*;

public class _1_Fahrenheit_to_Celsius_Table {
    public static void printFahrenheitTable(int start, int end, int size) {
        for (int i = start; i <= end; i += size) {
            System.out.println(i + "\t" + (int) ((5.0 / 9) * (i - 32)));

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int size = s.nextInt();
        printFahrenheitTable(start, end, size);
    }
}
