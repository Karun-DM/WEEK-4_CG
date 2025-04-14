import java.util.*;

public class LargeFileReadComparison {

    // Reads using FileReader (Character Stream)
    public static void readWithFileReader(String filePath) throws IOException {
        long start = System.nanoTime();

        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1) {
            // Just read characters, no processing
        }
        reader.close();

        long end = System.nanoTime();
        System.out.printf("FileReader Time: %.2f seconds\n", (end - start) / 1e9);
    }

    // Reads using InputStreamReader (Byte Stream + Decoder)
    public static void readWithInputStreamReader(String filePath) throws IOException {
        long start = System.nanoTime();

        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        while (reader.read() != -1) {
            // Just read characters, no processing
        }
        reader.close();

        long end = System.nanoTime();
        System.out.printf("InputStreamReader Time: %.2f seconds\n", (end - start) / 1e9);
    }

    public static void main(String[] args) {
        // Replace this with the path to your large test file (e.g., 500MB file)
        String filePath = "large_text_file.txt";

        try {
            System.out.println("--- Reading with FileReader ---");
            readWithFileReader(filePath);

            System.out.println("--- Reading with InputStreamReader ---");
            readWithInputStreamReader(filePath);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
 
