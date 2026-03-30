import java.io.*;

public class exp26 {
    public static void main(String[] args) {
        String filename = "output.txt";
        String content = "Hello, this is a test file.\nWriting and reading from file.";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Content written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from file and display
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
