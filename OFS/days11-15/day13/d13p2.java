import java.util.*;

public class d13p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] notes = new int[n];
        for (int i = 0; i < n; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println(solve(notes));
        sc.close();
    }

    static boolean solve(int[] notes) {
        Stack<Integer> stack25 = new Stack<Integer>();
        Stack<Integer> stack50 = new Stack<Integer>();
        Stack<Integer> stack100 = new Stack<Integer>();
        for (int i = 0; i < notes.length; i++) {
            int x = notes[i];
            if (x == 25) {
                stack25.push(x);
            } else if (x == 50) {
                if (stack25.isEmpty()) {
                    return false;
                } else {
                    stack25.pop();
                    stack50.push(x);
                }
            } else if (x == 100) {
                if (stack25.isEmpty()) {
                    return false;
                } else if (!stack50.isEmpty()) {
                    stack25.pop();
                    stack50.pop();
                    stack100.push(x);
                } else if (stack25.size() >= 3) {
                    stack25.pop();
                    stack25.pop();
                    stack25.pop();
                    stack100.push(x);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}