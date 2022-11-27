import java.util.*;

public class d9p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(thirdHighest(arr));
        sc.close();
    }

    static int thirdHighest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if (n <= 2) {
            return arr[0];
        } else {
            int count = 0;
            int prev = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != prev) {
                    count++;
                    prev = arr[i];
                }
                if (count == 2)
                    return arr[i];
            }
        }
        return -1;
    }
}