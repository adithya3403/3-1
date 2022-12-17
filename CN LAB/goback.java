// Go Back N protocol

import java.util.*;
public class goback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the window size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) System.out.println("frame " + i + " transmitted");
        System.out.print("enter the last acknowledgement received: ");
        int ack = sc.nextInt();
        for (int i = ack; i < ack + n; i++) System.out.println("frame " + i + " transmitted");
        sc.close();
    }
}

// enter the window size: 3
// frame 0 transmitted
// frame 1 transmitted
// frame 2 transmitted
// enter the last acknowledgement received: 12
// frame 12 transmitted
// frame 13 transmitted
// frame 14 transmitted