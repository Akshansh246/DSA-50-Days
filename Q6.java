import java.util.Arrays;

public class Q6 {
    public static void printUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        System.out.print("Union: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        System.out.print("\nIntersection: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        printUnion(arr1, arr2);
        printIntersection(arr1, arr2);
    }
}