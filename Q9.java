public class Q9 {
    public static boolean SortedAndRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        boolean isSortedAndRotated = SortedAndRotated(arr); 
        System.out.println(isSortedAndRotated);
    }
}
