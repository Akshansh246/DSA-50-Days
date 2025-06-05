public class Q15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = arr.length + 1;
        int total = n*(n+1)/2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
