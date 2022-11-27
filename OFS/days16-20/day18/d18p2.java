/*

Given a sorted list of integers, 

Your task is to find the continuous range of numbers, make them as groups
and print all the groups as show in the sample testcases.

For example:
Given list is [ 1, 2, 3 ]: 1, 2, 3 is continuous range, grouped as 1->3
Given list is [ 1, 2, 4, 5, 7 ]: 1, 2 is continuous range, grouped as 1->2, 
4,5 grouped as 4->5, 7 is left alone.

Note: List contain no duplicates.

Input Format:
-------------
Line-1 -> An integer N, number of elements.
Line-2 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of continuous range groups.


Sample Input-1:
---------------
5
1 2 4 5 7

Sample Output-1:
----------------
[1->2, 4->5, 7]

Explanation: 
------------
1,2 form a continuous range; 4,5 form a continuous range.


Sample Input-2:
---------------
9
1 2 3 5 6 7 9 10 12

Sample Output-2:
----------------
[1->3, 5->7, 9->10, 12]

Explanation: 
------------
1,2,3 form a continuous range 
5,6,7 form a continuous range
9,10 form a continuous range

*/

import java.util.*;

public class d18p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findContinuousRange(arr));
        sc.close();
    }

    static List<String> findContinuousRange(int[] arr) {
        List<String> res = new ArrayList<>();
        int start = arr[0];
        int end = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == end + 1) {
                end = arr[i];
            } else {
                if (start != end)
                    res.add(start + "->" + end);
                else
                    res.add(String.valueOf(start));
                start = end = arr[i];
            }
        }
        if (start == end)
            res.add(String.valueOf(start));
        else
            res.add(start + "->" + end);
        return res;
    }
}