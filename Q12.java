public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3 ,4, 4, 5, 6, 8, 9, 10, 10, 10, 11, 12, 13, 14, 15};
        int key = 3;
        int count = 0;
        for (int i : arr) {
            if (i == key) {
                count++;
            }
        }
        System.out.println("The number of occurrences of " + key + " is: " + count);
    }
}
