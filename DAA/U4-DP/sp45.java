// sp45 Traveller 

/*

Bob Marley is a jamaican singer, he loves to travel around the globe.
He planned to travel N famous places and return to the starting station.
Each place is indicated with numbers from 0 to N-1.
He will start the travel from Place-0.
 
You are given an integer N and cost matrix cost[][],a symmetric matrix, 
where cost[i][j] indiactes cost to travel from place-i to place-j and vice-versa, 
if cost[i][j]=0, indicates no way to travel from place-i to place-j and vice-versa. 

Your task is to help Bob Marley, to find the shortest possible travel plan
to visit every place and returns to starting place-0. 
Finally print the minimum cost to travel accordingly.

Input Format:
-------------
Line-1: An integer N. 
Next N lines: N space separated integers, cost of i to j.

Output Format:
--------------
Print an integer, the minimum cost to travel all the places and return to place-0.


Sample Input-1:
---------------
4
0 13 11 12
13 0 14 9
11 14 0 5
12 9 5 0

Sample Output-1:
----------------
38


Sample Input-2:
---------------
5
0 15 5 12 15
15 0 7 13 9
5 7 0 10 15
12 13 10 0 7
15 9 15 7 0

Sample Output-2:
----------------
40

*/
import java.util.*;

class sp45 {
    int minimumCost(int cost[][]) { // cost matrix is of size (n+1)*(n+1)
        // implement your logic here.
        // solve using dp
        int n = cost.length;
        int[][] dp = new int[1 << n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return tsp(cost, dp, 0, 0);
    }

    static int tsp(int[][] arr, int[][] dp, int mask, int pos) {
        if (mask == (1 << arr.length) - 1)
            return arr[pos][0];
        if (dp[mask][pos] != -1)
            return dp[mask][pos];
        int ans = Integer.MAX_VALUE;
        for (int city = 0; city < arr.length; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = arr[pos][city] + tsp(arr, dp, mask | (1 << city), city);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[mask][pos] = ans;
    }
}
