public class Q31 {
    public static int compress(char[] chars) {
        int index = 0, i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[index++] = current;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(input);
        System.out.print("Compressed: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(input[i]);
        }
    }
}

