import java.util.*;
public class BinarySearchTarget {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int target = 7;


     
        Arrays.sort(arr);


     
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("-1 (Target not found)");
    }
}
