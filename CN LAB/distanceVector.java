// Distance vector routing algorithm

import java.util.*;
public class distanceVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();
        System.out.println("Enter the distance matrix : ");
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Router info for router : " + (i + 1));
            System.out.println("Dest\t NextHop\t Dist\t");
            for (int j = 0; j < n; j++)
                System.out.println(j + "\t\t" + j + "\t\t" + arr[i][j] + "\t\t");
        }
        sc.close();
    }
}

/*
Output
Enter number of nodes : 3
Enter the distance matrix : 
1 0 99 0 2 99 3 2 0
Router info for router : 1      
Dest     NextHop         Dist   
0               0               1
1               1               0
2               2               99
Router info for router : 2
Dest     NextHop         Dist
0               0               0
1               1               2
2               2               99
Router info for router : 3
Dest     NextHop         Dist
0               0               3
1               1               2
2               2               0
*/