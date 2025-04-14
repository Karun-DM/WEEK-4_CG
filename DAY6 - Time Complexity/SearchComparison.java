
import java.util.*;

public class SearchComparison {

    // Linear Search (O(N))
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search (O(log N)), assumes sorted input
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Helper to measure execution time
    public static void measurePerformance(int dataSize) {
        Random rand = new Random();
        int[] data = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            data[i] = rand.nextInt(dataSize * 10); // wider range
        }

        int target = data[rand.nextInt(dataSize)];

        System.out.println("\nDataset Size: " + dataSize);

        // Linear Search
        long startTime = System.nanoTime();
        linearSearch(data, target);
        long endTime = System.nanoTime();
        System.out.printf("Linear Search Time: %.4f ms\n", (endTime - startTime) / 1e6);

        // Binary Search (sort + search)
        Arrays.sort(data); // O(N log N)
        startTime = System.nanoTime();
        binarySearch(data, target);
        endTime = System.nanoTime();
        System.out.printf("Binary Search Time: %.4f ms\n", (endTime - startTime) / 1e6);
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            measurePerformance(size);
        }
    }
}
