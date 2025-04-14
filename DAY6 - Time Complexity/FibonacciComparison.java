public class FibonacciComparison {

    // Recursive Fibonacci - Exponential Time O(2^N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci - Linear Time O(N)
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("\n--- Fibonacci of " + n + " ---");

            // Recursive
            if (n <= 30) { // Recursive for N > 30 is too slow
                long start = System.nanoTime();
                int fibRec = fibonacciRecursive(n);
                long end = System.nanoTime();
                System.out.printf("Recursive Result: %d, Time: %.2f ms\n", fibRec, (end - start) / 1e6);
            } else {
                System.out.println("Recursive Result: Skipped (Too slow)");
            }

            // Iterative
            long start = System.nanoTime();
            int fibIter = fibonacciIterative(n);
            long end = System.nanoTime();
            System.out.printf("Iterative Result: %d, Time: %.2f ms\n", fibIter, (end - start) / 1e6);
        }
    }
}
