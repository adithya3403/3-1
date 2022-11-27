import java.util.*;

class d14p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(canMatch(a, b));
        sc.close();
    }

    static boolean canMatch(String a, String b) {
        Map<Character, String> map = new HashMap<>();
        String[] words = b.trim().split(" ");
        if (a.length() != words.length)
            return false;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i]))
                    return false;
            } else {
                if (map.containsValue(words[i]))
                    return false;
                map.put(c, words[i]);
            }
        }
        return true;
    }
}