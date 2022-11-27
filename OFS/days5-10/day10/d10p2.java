import java.util.*;

public class d10p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(friendly(s1, s2));
        sc.close();
    }

    static boolean friendly(String s1, String s2) {
        int c = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                c++;
        }
        if (c == 2)
            return true;
        else if (c == 0) {
            int[] count = new int[26];
            for (int i = 0; i < s1.length(); i++)
                count[s1.charAt(i) - 'a']++;
            for (int i = 0; i < 26; i++)
                if (count[i] > 1)
                    return true;
            return false;
        }
        return false;
    }
}