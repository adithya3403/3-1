import java.util.*;

public class d5p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(str[i]);
        System.out.println(samosasLeft(arr));
        sc.close();
    }

    static int samosasLeft(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
            pq.add(arr[i]);
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a == b)
                continue;
            pq.add(a - b);
        }
        if (pq.size() == 0)
            return 0;
        return pq.poll();
    }
}