/*

Mr Ibrahim and Kumar are playing a game of luck. 
There is a treasure in front of them, the treasure is on top of N bricks,
in order to win the treasure, the rules are as follows:
    - Each turn, the player remove K bricks from the bottom.
    - where K is, 0 < K < N.
    - and N should be perfectly divisible by K.

The player who cannot remove any more bricks, is called unlucky and the other
player wins the treasure. It is said that Ibrahim will start the game always.
Your task is to print 'true' if Ibrahim wins the treasure, otherwise 'false'.


Input Format:
-------------
An integer N, number of bricks.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3

Sample Output-1:
----------------
false

Explanation:
------------
Ibrahim removes 1 brick, Kumar removes 1 brick, 
Now, Ibrahim cannot remove any more brick.


Sample Input-2:
---------------
2

Sample Output-2:
----------------
true

Explanation: 
------------
Ibrahim removes 1 brick, Kumar cannot removes the brick.

*/

import java.util.*;

public class d20p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 2 == 0);
        sc.close();
    }
}