public class Q24 {
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i = l; i <= r; i++) {
            str = swap(str, l, i); // Fix one char
            permute(str, l + 1, r); // Recur for rest
            str = swap(str, l, i); // Backtrack
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }
}

