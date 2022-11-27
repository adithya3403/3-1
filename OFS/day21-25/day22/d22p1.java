/*

You are given a bunch of sticks with diffrent lengths.
All the even length sticks should be arranged to appear first in the bunch and 
all the odd length sticks should be arranged to appear last in the bunch.

Print the length of the sticks, after arranging them according to above conditions. 

NOTE: The relative order of the sticks should be maintained.

Input Format:
-------------
Line-1: An integer N, number of sticks in the bunch
Line-2: N space separated integers, lengths of the sticks.

Output Format:
--------------
Print the list of length of the sticks after arrangements accordingly.


Sample Input-1:
---------------
4
1 4 3 2

Sample Output-1:
----------------
[4, 2, 1, 3]


Sample Input-2:
---------------
8
10 13 1 6 9 12 9 10

Sample Output-2:
----------------
[10, 6, 12, 10, 13, 1, 9, 9]

*/

import java.util.*;

public class d22p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i : arr)
            if (i % 2 == 0)
                System.out.print(i + " ");
        for (int i : arr)
            if (i % 2 != 0)
                System.out.print(i + " ");
        sc.close();
    }
}