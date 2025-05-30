public class Q10 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxfromRight = arr[arr.length - 1]; 

        System.out.print("Leaders in the array: "+ maxfromRight +" ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxfromRight) {
                maxfromRight = arr[i];
                System.out.print(maxfromRight + " ");
            }
        }
    }
}
