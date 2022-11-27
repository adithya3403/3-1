/*

You are given an integer N, 
Your task is print the pattern like in samples given below.

Note: Please find the logic of the pattern through samples.

Input Format:
-------------
An integer N

Output Format:
--------------
Print the pattern like in sample testcases.


Sample Input-1:
---------------
3

Sample Output-1:
----------------
1
2 4
3 5 6


Sample Input-2:
---------------
4

Sample Output-2:
----------------
1
2 5
3 6 8
4 7 9 10


*/

import java.util.*;

public class d16p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    static void printPattern(int n) {
        int[][] arr = new int[n][n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[j][i] = k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}