import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort (O(N^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Merge Sort (O(N log N))
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort (O(N log N) on average)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Measure sorting time
    public static void measureSortTimes(int dataSize) {
        Random rand = new Random();
        int[] baseArray = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            baseArray[i] = rand.nextInt(dataSize * 10);
        }

        System.out.println("\nDataset Size: " + dataSize);

        // Bubble Sort (only if N ≤ 10,000)
        if (dataSize <= 10000) {
            int[] bubbleArr = Arrays.copyOf(baseArray, baseArray.length);
            long start = System.nanoTime();
            bubbleSort(bubbleArr);
            long end = System.nanoTime();
            System.out.printf("Bubble Sort Time: %.4f ms\n", (end - start) / 1e6);
        } else {
            System.out.println("Bubble Sort Time: Skipped (Unfeasible for large N)");
        }

        // Merge Sort
        int[] mergeArr = Arrays.copyOf(baseArray, baseArray.length);
        long start = System.nanoTime();
        mergeSort(mergeArr);
        long end = System.nanoTime();
        System.out.printf("Merge Sort Time: %.4f ms\n", (end - start) / 1e6);

        // Quick Sort
        int[] quickArr = Arrays.copyOf(baseArray, baseArray.length);
        start = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        end = System.nanoTime();
        System.out.printf("Quick Sort Time: %.4f ms\n", (end - start) / 1e6);
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            measureSortTimes(size);
        }
    }
}
