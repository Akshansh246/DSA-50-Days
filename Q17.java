import java.util.ArrayList;

public class Q17 {
    public static void findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Intersection: " + result);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};
        findIntersection(arr1, arr2);
    }
}
