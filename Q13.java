public class Q13 {
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int sum = 0;
        int target = 8;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j]+ ")");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}

