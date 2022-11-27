import java.util.*;

public class d5p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(canShoot(arr));
        sc.close();
    }

    public static int canShoot(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        int c = 0;
        for (int i : arr)
            if (max == i)
                c++;
        return c;
    }
}