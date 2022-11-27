/*

Pranay is playing a single row word puzzle.
The Word Puzzle P contains a word, formed by using letter-blocks.
You are allowed to do only one operation:
	- You can remove one letter-block, and join 
	  the remaing letter-blocks into a single word.

Note: You cannot put back the removed letter-block.
And relative order of the letter-blocks has to be maintained.

Pranay is given a word W, and the word puzzle P,
You need to help Pranay, to check whether he can form the word W,
from the given word puzzle P.

Input Format:
-------------
Two strings W and P

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
coder commander

Sample Output-1:
----------------
true


Sample Input-2:
---------------
memory memorial

Sample Output-2:
----------------
false

*/

import java.util.*;

public class d23p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(canForm(a, b));
        sc.close();
    }

    static boolean canForm(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    b = b.substring(0, j) + b.substring(j + 1);
                    break;
                }
            }
        }
        return a.length() == b.length();
    }
}