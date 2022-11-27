import java.util.*;

public class d5p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++)
            marks[i] = sc.nextInt();
        afterChanging(marks);
        for (int i : marks)
            System.out.print(i + " ");
        sc.close();
    }

    static void afterChanging(int[] arr) {
        int i = 0, n = arr.length;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}