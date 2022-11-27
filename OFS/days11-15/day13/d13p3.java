import java.util.*;

public class d13p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bags = sc.nextInt();
        int boxes = sc.nextInt();
        int[][] arr = new int[bags][boxes];
        for (int i = 0; i < bags; i++)
            for (int j = 0; j < boxes; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(findLeastCommonWeight(arr, bags, boxes));
        sc.close();
    }

    static int findLeastCommonWeight(int[][] arr, int bags, int boxes) {
        int low = 0, high = boxes - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isCommon(arr, bags, boxes, mid)) {
                res = arr[0][mid];
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return res;
    }

    static boolean isCommon(int[][] arr, int bags, int boxes, int mid) {
        int x = arr[0][mid];
        for (int i = 1; i < bags; i++)
            if (!binarySearch(arr[i], x))
                return false;
        return true;
    }

    static boolean binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return true;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}