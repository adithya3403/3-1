/*

You are given a list of positive integers List[].
You need to findout the product P as (List[i]-1)*(List[j]-1).
Where P should be the largest possible value, 
and i, j are the postions of the two different elements in the List.

Input Format:
-------------
Line-1: An integer N, number of elemenets of the list.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer, P


Sample Input-1:
---------------
4
3 4 5 2

Sample Output-1:
----------------
12


Sample Input-2:
---------------
4
2 5 4 5

Sample Output-2:
----------------
16

*/

import java.util.*;

public class d22p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                max = Math.max(max, (arr[i] - 1) * (arr[j] - 1));
        System.out.println(max);
        sc.close();
    }
}