public class Q21 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder reversed = new StringBuilder();
        reversed.reverse().toString();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("Reversed string: " + reversed.toString());
    }
}
