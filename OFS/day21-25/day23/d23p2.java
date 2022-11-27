/*

Suman is given two words W1 and W2. 
His task is to derive W2 from W1, withthe following operations:
	- Replace all the occurrences of a letter in W1 with any other letter.
	- Repeat the above step to derive  W2 from W1.
	
Your task is to check whether W2 can be derived from W1 or not.
If yes, print 'true', Otherwise print 'false'.

NOTE: You may assume both W1 and W2 have the same length.

Input Format:
-------------
Line-1: A String,a word W1
Line-2: A String,a word W2

Output Format:
--------------
Print a boolean value


Sample Input-1:
-------------------
paper 
title

Sample Output-1:
---------------------
true

Explanation:
----------------
'p' is replaced with 't', 'a' is with 'i', 'e' is with 'l', and 'r' with 'e'.


Sample Input-2:
-------------------
memo 
demo

Sample Output-2:
---------------------
false

*/

import java.util.*;

public class d23p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next(), w2 = sc.next();
        System.out.println(canDerive(w1, w2));
        sc.close();
    }

    static boolean canDerive(String a, String b) {
        if (a.length() != b.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else
                map.put(c1, c2);
        }
        return true;
    }
}