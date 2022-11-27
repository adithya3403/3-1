import java.util.*;

public class d13p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        int p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    p += 4;
                    if (i > 0 && arr[i - 1][j] == 1)
                        p = p - 2;
                    if (j > 0 && arr[i][j - 1] == 1)
                        p = p - 2;
                }
            }
        }
        System.out.println(p);
        sc.close();
    }
}