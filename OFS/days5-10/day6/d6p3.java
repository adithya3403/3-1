import java.util.*;

public class d6p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numOfZeroes(n));
        sc.close();
    }

    static int numOfZeroes(int n) {
        int count = 0;
        int i = 5;
        while (n >= i) {
            count += n / i;
            i = i * 5;
        }
        return count;
    }
}