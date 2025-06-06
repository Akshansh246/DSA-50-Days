import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {
    public static void rearrangeAlt(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = neg.get(n++);
            arr[i++] = pos.get(p++);
        }

        while (n < neg.size()) arr[i++] = neg.get(n++);
        while (p < pos.size()) arr[i++] = pos.get(p++);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrangeAlt(arr);
        System.out.println(Arrays.toString(arr));
    }
}