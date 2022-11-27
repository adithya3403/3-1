/*

Special numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 Special 
numbers. By convention, 1 is included.

You are given a number n, the task is to find n-th Special number.

Input Format:
-------------
An integer N.

Output Format:
--------------
Print N-th Special Number.


Sample Input-1:
---------------
7

Sample Output-1:
----------------
8


Sample Input-2:
---------------
15

Sample Output-2:
----------------
24

*/

import java.util.*;

public class d25p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthSpecial(n));
        sc.close();
    }

    static int nthSpecial(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (dp[i] == dp[i2] * 2)
                i2++;
            if (dp[i] == dp[i3] * 3)
                i3++;
            if (dp[i] == dp[i5] * 5)
                i5++;
        }
        return dp[n - 1];
    }
}