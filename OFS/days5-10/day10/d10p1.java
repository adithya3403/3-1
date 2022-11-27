import java.util.*;

public class d10p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fizzbuzz(n));
        sc.close();
    }

    static List<String> fizzbuzz(int n) {
        List<String> res = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                res.add("FizzBuzzJazz");
            else if (i % 2 == 0 && i % 3 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0 && i % 5 == 0)
                res.add("BuzzJazz");
            else if (i % 2 == 0 && i % 5 == 0)
                res.add("JazzFizz");
            else if (i % 2 == 0)
                res.add("Fizz");
            else if (i % 3 == 0)
                res.add("Buzz");
            else if (i % 5 == 0)
                res.add("Jazz");
            else
                res.add(Integer.toString(i));
        }
        return res;
    }
}