public class Q28 {
    public static int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Convert digits and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String input = "   -42";
        System.out.println("Converted Integer: " + myAtoi(input));
    }
}
