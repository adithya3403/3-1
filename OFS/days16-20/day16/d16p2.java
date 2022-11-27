/*

Karthik is going on a world tour, He prefers to travel in airplanes.
He is given a list of planes avaialble , where a plane[i]=[src-i, dest-i].
i.e, plane[i] indiactes airplane from source city to destination city.

Your task is to findout in which city karthk will end up his world tour.
end up the tour means, he cannot travel further from that city.

Note: It is guaranteed that there is no loop. 

Input Format:
-------------
Line-1: An integer N, number of airplanes routes.
next N lines: two comma (',') separated Strings, source and destination.

Output Format:
--------------
Print a string, City Name.


Sample Input-1:
---------------
3
London,New York
New York,Sydney
Sydney,New Delhi

Sample Output-1:
----------------
New Delhi



Sample Input-2:
---------------
5
New Delhi,Kerala
Kerala,Kashmir
London,New York
New York,Sydney
Sydney,New Delhi

Sample Output-2:
----------------
Kashmir

*/

import java.util.*;

public class d16p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] src = new String[n];
        String[] dest = new String[n];
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(",");
            src[i] = s[0];
            dest[i] = s[1];
        }
        String start = src[0];
        String end = dest[0];
        for (int i = 0; i < n; i++) {
            if (start.equals(dest[i])) {
                start = src[i];
            }
            if (end.equals(src[i])) {
                end = dest[i];
            }
        }
        System.out.println(end);
        sc.close();
    }
}