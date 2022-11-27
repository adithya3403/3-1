import java.util.*;

public class d12p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(decoded(s, arr));
        sc.close();
    }

    static String decoded(String s, int[] arr) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(arr[i], s.charAt(i));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            sb.append(map.get(i));
        return sb.toString();
    }
}