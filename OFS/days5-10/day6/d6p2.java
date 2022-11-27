import java.util.*;

public class d6p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(length(str));
        sc.close();
    }

    static int length(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int res = 0;
        for (int i = 0; i < 256; i++) {
            res += count[i] / 2 * 2;
            if (res % 2 == 0 && count[i] % 2 == 1) {
                res++;
            }
        }
        return res;
    }
}