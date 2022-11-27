import java.util.*;

class d14p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(countOfDiffBits(m, n));
        sc.close();
    }

    static int countOfDiffBits(int m, int n) {
        String mb = Integer.toBinaryString(m);
        String nb = Integer.toBinaryString(n);
        int maxlen = Math.max(mb.length(), nb.length());
        mb = String.format("%" + maxlen + "s", mb).replace(' ', '0');
        nb = String.format("%" + maxlen + "s", nb).replace(' ', '0');
        int c = 0;
        for (int i = 0; i < maxlen; i++) {
            if (mb.charAt(i) != nb.charAt(i)) {
                c++;
            }
        }
        return c;
    }
}