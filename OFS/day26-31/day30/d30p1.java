/*

There are N lamp-posts with various heights as an array height[]. A group 
of lamp-posts is called as closed sequence when we subtract the maximum height 
and minimum height of the lamp-post among all in that group should be 1.

You can form the lamp-post group as sequence of lamp-posts. A sequence 
is formed by removing some or no lamp-posts without changing the order of them.

Your task is to find the length of its largest closed lamp-post sequence among 
all its possible sequences.

Input Format:
-------------
Line-1: An integer N, number of lamp-posts.
Line-2: N space separated integers, represent the heights[].
 
Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
6
4 3 5 2 6 3
 
Sample Output-1:
----------------
3

Explanation:
------------
lamp-post sequence is [4,3,3]


Sample Input-2:
---------------
7
20 19 19 29 37 35 19

Sample Output-2:
----------------
4

Explanation:
------------
lamp-post sequence is [20 19 19 19]
 
*/

import java.util.*;

public class d30p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                max = Math.max(max, map.get(i) + map.get(i + 1));
            }
        }
        System.out.println(max);
        sc.close();
    }
}