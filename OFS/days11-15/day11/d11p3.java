import java.util.*;

public class d11p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallestIndex(arr));
        sc.close();
    }

    static int smallestIndex(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < mid)
                l = mid + 1;
            else
                r = mid - 1;
        }
        if (arr[l] == l)
            return l;
        else
            return -1;
    }
}