public class StringConcatPerformance {

    public static void testStringConcat(int n) {
        long start = System.nanoTime();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a"; // Inefficient: creates a new object every time
        }
        long end = System.nanoTime();
        System.out.printf("String (Immutable) - Time for %,d ops: %.2f ms\n", n, (end - start) / 1e6);
    }

    public static void testStringBuilderConcat(int n) {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        System.out.printf("StringBuilder (Fast) - Time for %,d ops: %.2f ms\n", n, (end - start) / 1e6);
    }

    public static void testStringBufferConcat(int n) {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        System.out.printf("StringBuffer (Thread-safe) - Time for %,d ops: %.2f ms\n", n, (end - start) / 1e6);
    }

    public static void main(String[] args) {
        int[] operationCounts = {1000, 10000, 1000000};

        for (int n : operationCounts) {
            System.out.println("\n--- Testing for N = " + n + " ---");
            
            // String (skip large N to avoid long runtime)
            if (n <= 10000) {
                testStringConcat(n);
            } else {
                System.out.printf("String (Immutable) - Time for %,d ops: Skipped (Too slow)\n", n);
            }

            // StringBuilder
            testStringBuilderConcat(n);

            // StringBuffer
            testStringBufferConcat(n);
        }
    }
}
