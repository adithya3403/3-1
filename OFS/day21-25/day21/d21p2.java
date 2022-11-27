/*

Pranav is playing with numbers 2 and 5 only.
He is given an integer N consist of 2 and 5 only.
Pranav is trying to find the maximum number by 
altering atmost one digit in the given N  

Help pranav to find the maximum number.

Input Format:
-------------
An integer N, consist of 2 and 5

Output Format:
--------------
Print the maximum number.


Sample Input-1:
---------------
5225

Sample Output-1:
----------------
5525

Explanation:
---------------
alter the 1st digit-> 2225
alter the 2nd digit-> 5525.
alter the 3rd digit-> 5255.
alter the 4th digit->5222.
So, The maximum number is 5525.


Sample Input-2:
---------------
52525

Sample Output-2:
----------------
55525


Sample Input-3:
---------------
2555

Sample Output-3:
----------------
5555

*/

import java.util.*;

public class d21p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        List<String> list = new ArrayList<>();
        list.add(s);
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            if (s.charAt(i) == '2') {
                sb.setCharAt(i, '5');
                list.add(sb.toString());
            } else {
                sb.setCharAt(i, '2');
                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        int size = list.size();
        System.out.println(list.get(size - 1));
        sc.close();
    }
}