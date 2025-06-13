import java.util.HashSet;

public class Q23 {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}
