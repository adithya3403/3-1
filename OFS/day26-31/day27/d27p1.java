/*

A crew of N players played a game for one time, and got some scores.
They have to stand in the same positions after they played the game.
 
There is a constraint that, the player-K score, should not be greater or smaller 
than both of his neighbors. To achieve this constraint, there are few steps 
to be followed as mentioned:
    	- If the score of player-K is smaller than both his neighbors,
    	  then his score is incremented by 1.
    	- If the score of player-K is greater than both his neighbors,
    	  then his score is decremented by 1.
    	- The first and last elements never change.
    	- Repeat these steps, until the constraint is satisified.
   
Your task is to find and print the resultant array of scores, after the constraint is achieved.
   
NOTE: Players are not allowed to swap their positions to achieve the constraint.
  
Input Format:
-------------
Line-1: An integer N, number of players.
Line-2: N space separated integers represemts scores of each player.
  
Output Format:
--------------
Print integer array, the resultant scores.
   
Sample Input-1:
---------------
6
4 3 5 2 6 3
  
Sample Output-1:
----------------
[4, 4, 4, 4, 4, 3]
   
   
Sample Input-2:
---------------
8
5 1 4 2 7 4 6 3
  
Sample Output-2:
----------------
[5, 3, 3, 3, 5, 5, 5, 3]


*/

import java.util.*;

public class d27p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = solve(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

    static int[] solve(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        while (true) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1)
                    dp[i] = arr[i];
                else {
                    if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                        dp[i] = arr[i] + 1;
                    else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                        dp[i] = arr[i] - 1;
                    else
                        dp[i] = arr[i];
                }
            }
            if (Arrays.equals(arr, dp))
                break;
            for (int j = 0; j < n; j++)
                arr[j] = dp[j];
        }
        return arr;
    }
}