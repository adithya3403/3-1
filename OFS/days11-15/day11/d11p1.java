import java.util.*;

public class d11p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(countPairs(arr));
        sc.close();
    }

    static int countPairs(int[] arr) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        for (int key : map.keySet())
            c += (map.get(key) * (map.get(key) - 1)) / 2;
        return c;
    }
}