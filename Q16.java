import java.util.HashSet;
import java.util.Set;

public class Q16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)){
                System.out.println("Duplicate found: " + num);
                break;
            }
            else seen.add(num);
        }
    }
}