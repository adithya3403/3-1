/*

Krishna manohar and Santosh are working on a military operation at Himachal Pradesh. 
They are given an operation to defuse the bomb, and they have time falling short.

Their informer will provide them with a round-shape lock that can hold L integers 
and a clue ‘C’.

To defuse the bomb they have to restore the original state of the lock, 
by restoring every integer on lock. All the integers must be restored in 
the same way based on the clue.

Its your task to help Krishna manohar, to restore the original code on the lock,
to defuse the bomb.

To restore the lock to its original state, you have to follow these instructions:
    - If C > 0, restore every i-th number with the sum of the next C integers.
    - If C < 0, restore every i-th number with the sum of the previous C integers.
    - If C == 0, restore every i-th number with 0.
   
As the lock is in round shpae, the next element of lock[n-1] is lock[0], 
and the previous element of lock[0] is lock[n-1].

Input Format:
-------------
Line-1: Two space separated integers L, C.
Line-2: L space separated integers, integers on the Lock.

Output Format:
--------------
Print the original state of the lock.

Sample Input-1:
---------------
5 2
2 5 9 4 7

Sample Output-1:
----------------
[14, 13, 11, 9, 7]


Sample Input-2:
---------------
5 0
1 5 6 3 2

Sample Output-2:
----------------
[0, 0, 0, 0, 0]

*/

import java.util.*;

public class d28p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = solve(arr, c);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] solve(int[] arr, int c) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (c > 0) {
                for (int j = 0; j < c; j++) {
                    sum += arr[(i + j + 1) % n];
                }
            } else if (c < 0) {
                for (int j = 0; j < -c; j++) {
                    sum += arr[(i - j - 1 + n) % n];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}