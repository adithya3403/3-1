/*

Varun and Saahil are playing a word game. Saahil has given a word of length N 
and a character(ch) which exist in the word. Now Varun's task is to find the 
least distance of the given character in the word for each position in the word.

Your task is to help Varun to return an array result[], where result length=N 
and result[i] is the least distance from the given character to index i in the word.

NOTE:
-----
The distance between two indices i and j is |i - j|.

Input Format:
-------------
Line-1: A string represents a word
Line-2: A character ch which exist in the word.
 
Output Format:
--------------
Print an array of N values
 

Sample Input-1:
---------------
conclude
c
 
Sample Output-1:
----------------
0 1 1 0 1 2 3 4

 
Sample Input-2:
---------------
kmitngit
i

Sample Output-2:
----------------
2 1 0 1 2 1 0 1 

*/

import java.util.*;

public class d30p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char x = sc.next().charAt(0);
        closestDistance(s, x);
        sc.close();
    }

    static void closestDistance(String str, char x) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != x) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == x) {
                        min = Math.min(min, Math.abs(i - j));
                    }
                }
                arr[i] = min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}