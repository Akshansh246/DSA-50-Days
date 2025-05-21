//find max and min ele in an array
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,7,9,2};
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
}