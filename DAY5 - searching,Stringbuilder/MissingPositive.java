public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};


        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("First missing positive: " + i);
                return;
            }
        }


        System.out.println("First missing positive: " + (max + 1));
    }
}
