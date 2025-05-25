public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 5, -8, 4, -9, 2, 3};
        int left = 0, right = arr.length - 1;
        while (left<=right) {
            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}