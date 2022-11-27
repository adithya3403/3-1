/*

Mr. Chandra has an portrait photo with size M*N pixels, 
where M is the length of the portrait and N is width of the portrait.

You are given an integer S in pixels,
Your task is to help Mr. Chammak Chandra to find the actual values 
[M, N] using the following specifications:
- The size of portrait should be equal to S. i.e., S = M*N.
- N is always smaller than in M, i.e., N <= M
- The diffrence between length and width, (M-N) should be minimum.
And print the result as a pair M and N.

NOTE: S is always a positive integer.

Input Format:
-------------
Line-1 -> An integer S, size of the portrait.

Output Format:
--------------
Print the result as a pair of integers.


Sample Input-1:
---------------
24

Sample Output-1:
----------------
6 4


Sample Input-2:
---------------
550

Sample Output-2:
----------------
25 22

*/

import java.util.*;

public class d24p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = LengthAndWidth(n);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }

    static int[] LengthAndWidth(int n) {
        List<Integer> factors = getFactors(n);
        // System.out.println(factors);
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;
        int i = 0, j = factors.size() - 1;
        while (i <= j) {
            int diff = factors.get(j) - factors.get(i);
            if (diff < min) {
                min = diff;
                res[0] = factors.get(j);
                res[1] = factors.get(i);
            }
            i++;
            j--;
        }
        // System.out.println(res[0] + " " + res[1]);
        return res;
    }

    static List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors.add(i);
        }
        return factors;
    }
}