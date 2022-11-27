import java.util.*;

public class d8p1 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(extraChar(s1, s2));
        sc.close();
    }
    public static char extraChar(String s1, String s2) {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int n1=c1.length;
        int n2=c2.length;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i=0; i<n1; i++) {
            if (c1[i]!=c2[i]) {
                return c2[i];
            }
        }
        return c2[n2-1];
    }
}