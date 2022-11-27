/*

Mr. Kejriwal purchased a digital clock, it shows the time in "hh:mm" 24 hr format.
Due to technical issue, in the place of some digits ot displays '#' symbol.

As Mr Kejriwal is an IIT student also, he got an idea to find the number of 
valid times by replacing '#' with valid digits between 0-9.

You are iven the time as a string T.
Your task is to help Mr Kejriwal to find the number of possible valid times.

NOTE:
-----
The valid time is in the range of 00:00 to 23:59.


Input Format:
-------------
A string T, the time in the (24-hr) format as "hh:mm" 

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
#6:00

Sample Output-1:
----------------
2

Explanation:
------------
The valid times after replacing # with 0 or 1, are "06:00", "16:00". 


Sample Input-2:
---------------
0#:0#

Sample Output-2:
----------------
100

Explanation:
------------
To make the given time valid, replace 1st # with 0-9 digits and 2nd with the same.
So, totally we have 100 ways.

*/

import java.util.*;

public class d26p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        System.out.println(countTime(time));
        sc.close();
    }

    static int countTime(String t) {
        int c = 1;
        if (t.charAt(0) == '#') {
            if (t.charAt(1) >= '4' && t.charAt(1) <= '9')
                c *= 2;
            else
                c *= 3;
        }
        if (t.charAt(1) == '#') {
            if (t.charAt(0) == '#')
                c = 24;
            else if (t.charAt(0) == '2')
                c = c * 4;
            else
                c *= 10;
        }
        if (t.charAt(3) == '#')
            c = c * 6;
        if (t.charAt(4) == '#')
            c = c * 10;
        return c;
    }
}