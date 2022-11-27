import java.util.*;

public class d6p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
        sc.close();
    }

    static int ans(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res + (n & 1);
            n = n >> 1;
            if (i < 31)
                res = res << 1;
        }
        return res;
    }
}