public class Q19 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] brr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            brr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            brr[arr1.length + i] = arr2[i];
        }
        for (int k2 = 0; k2 < brr.length; k2++) {
            System.out.print(brr[k2]+" ");
        }
    }
}
