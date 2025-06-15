import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            System.out.println("No");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
