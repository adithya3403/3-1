import java.util.*;

public class d11p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countPairs(str));
        sc.close();
    }

    static int countPairs(String s) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
                a++;
            else
                b++;
            if (a == b)
                c++;
        }
        return c;
    }
}