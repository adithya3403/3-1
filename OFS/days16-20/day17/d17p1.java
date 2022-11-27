/*

Mr Sayyad is given a list of words. Mr Sayyad observed a similarity among 
the list of words, there exists a common subword in every word in the list, 
from the index-0 (from the begining of the word). 

Your task is to find out the common subword which is largest.

Input Format:
-------------
Single line space separated integers, the list[].

Output Format:
--------------
Print the string, the largest common word.


Sample Input-1:
---------------
money monkey monday

Sample Output-1:
----------------
mon


Sample Input-2:
---------------
corn cook book clock

Sample Output-2:
----------------
""  //empty string

*/

import java.util.*;

public class d17p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        System.out.println(largestCommonWord(words));
        sc.close();
    }

    static String largestCommonWord(String[] words) {
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
