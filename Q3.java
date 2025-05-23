import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i< n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.print("Enter the Kth largest and smallest element to find: ");
        int k = sc.nextInt();
        Collections.sort(arr);
        System.out.println("The " + k + "th largest element is: " + arr.get(arr.size() - k));
        System.out.println("The " + k + "th smallest element is: " + arr.get(k - 1));
        
    }
}
