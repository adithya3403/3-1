import java.util.*;

public class d12p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(getMaxPpl(arr));
        sc.close();
    }

    static int getMaxPpl(int[] arr) {
        Arrays.sort(arr);
        int c = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum <= 500)
                c++;
            else
                break;
        }
        return c;
    }
}