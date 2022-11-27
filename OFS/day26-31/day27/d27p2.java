/*

Tribhuvan Das checking his luck in diamonds. There are N boxes in a row and 
each box has a number of diamonds in it. Box[i] is the number of diamonds in 
ith box(0-indexed).

Tribhuvan Das has to choose the boxes to grab the diamonds, in order to do that
he has to choose the boxes which are not adjacent.

For example:if the boxes are [a,b,c,d,e] then he can choose [a,c,e] or [b,d] 
or [a, d] or [b,e] etc.

Your task is to help Mr Tribhuvan Das to collect the maximum diamonds.


Input Format:
-------------
Line-1: An Integer N represents number of boxes.
Line-2: N space separated integers represents diamonds in each box.

Output Format:
--------------
Print an integer.

Constraints:

1 <= N <= 100
0 <= box[i] <= 400


Sample Input-1:
---------------
4
5 10 25 21

Sample Output-1:
----------------
31

Explanation:
------------
He can choose either 5+25 or 10+21 or 5+21.
The maximum is 31.


Sample Input-2:
---------------
3
20 30 40


Sample Output-2:
----------------
60

Explanation:
------------
He can choose either 20+40 or 30.
The maximum is 60.

*/

import java.util.*;

public class d27p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findMax(arr));
        sc.close();
    }

    static int findMax(int arr[]) {
        int n = arr.length;
        arr[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++)
            arr[i] = Math.max(arr[i - 1], arr[i - 2] + arr[i]);
        return arr[n - 1];
    }
}