import java.util.*;

public class d8p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isMatching(s1, s2));
        sc.close();
    }

    static boolean isMatching(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (Character.isDigit(s2.charAt(j))) {
                int n = 0;
                while (j < s2.length() && Character.isDigit(s2.charAt(j))) {
                    n = n * 10 + (s2.charAt(j) - '0');
                    j++;
                }
                i = i + n;
            } else {
                if (s1.charAt(i) != s2.charAt(j))
                    return false;
                i++;
                j++;
            }
        }
        return (s1.length() == i && s2.length() == j);
    }
}