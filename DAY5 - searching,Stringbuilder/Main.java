public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7};
        int target = 4;


        int first = -1;
        int last = -1;


        int low = 0, high = arr.length - 1;


       
        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


       
        low = 0;
        high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}


