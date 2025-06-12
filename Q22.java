public class Q22 {
    public static void main(String[] args) {
        String str = "Madam";
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}