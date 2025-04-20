public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot
        int i = low - 1; // smaller element index

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
