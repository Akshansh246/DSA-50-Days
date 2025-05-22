public class Q2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int left = arr[0], right = arr[arr.length-1];
        for (int i = 0; i <= arr.length/2; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;