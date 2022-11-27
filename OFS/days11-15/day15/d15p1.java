import java.util.*;

public class d15p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * 2];
        for (int i = 0; i < n * 2; i++)
            arr[i] = sc.nextInt();
        solve(arr, n);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void solve(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i + n;
            arr[j] = (arr[i] << 10) + arr[j];
        }
        int i = 0;
        for (int j = n; j < 2 * n; j++) {
            arr[i] = arr[j] / 1024;
            arr[i + 1] = arr[j] % 1024;
            i = i + 2;
        }
    }
}