public class Q29 {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println("Index of substring: " + strStr(haystack, needle));
    }
}
