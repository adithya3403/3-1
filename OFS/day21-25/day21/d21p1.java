/*

In front of a kirana shop, there are N persons in a line, 
Each of them waiting to pay some amount(-ve) or to recieve some amount(+ve).

You are given an array of N integers amounts[] , amount[i] is the amount to pay 
or recieve. You have to choose a positive amount 'startAmount', and start.
In each iteration, you calculate the step by step addition of
amount of 'startAmount' with amounts in nums[] (from left to right).

You have to return the minimum positive amount of startAmount
such that the step by step amount is never less than 1.

Input Format:
-------------
Line-1: An integer N, number of persons.
Line-2: N space separated integers, amounts[].

Output Format:
--------------
Print an integer, minimum positive amount.


Sample Input-1:
---------------
5
-3 2 -3 4 2

Sample Output-1:
----------------
5

Explanation:
------------
If you choose startAmount = 4, in the third iteration your step by step sum
is less than 1.
step by step sum startAmount = 4 	| startAmount = 5| nums
						(4 -3 ) = 1	| (5 -3 ) = 2 	 | -3
						(1 +2 ) = 3 | (2 +2 ) = 4	 | 2
						(3 -3 ) = 0 | (4 -3 ) = 1 	 | -3
						(0 +4 ) = 4 | (1 +4 ) = 5	 | 4
						(4 +2 ) = 6 | (5 +2 ) = 7	 | 2


Sample Input-2:
---------------
3
1 -2 -3

Sample Output-2:
----------------
5

*/

import java.util.*;

public class d21p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] amount = new int[n];
        for (int i = 0; i < n; i++)
            amount[i] = sc.nextInt();
        System.out.println(minStartValue(amount));
        sc.close();
    }

    static int minStartValue(int[] nums) {
        int min = 1, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, sum);
        }
        return 1 - min;
    }
}