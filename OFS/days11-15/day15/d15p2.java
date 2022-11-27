import java.util.*;

public class d15p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(jumping(str));
        sc.close();
    }

    static boolean jumping(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'U')
                y++;
            else if (c == 'D')
                y--;
            else if (c == 'R')
                x++;
            else if (c == 'L')
                x--;
        }
        return x == 0 && y == 0;
    }
}