import java.util.*;

public class d8p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairs(n));
        sc.close();
    }

    public static int stairs(int n) {
        int i = 1;
        int count = 0;
        while (n - i >= 0) {
            n = n - i;
            i += 1;
            count++;
        }
        return count;
    }
}