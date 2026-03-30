import java.io.*;

public class FileCopy {
    
    /**
     * Copies a file from source to destination using byte stream approach.
     * Works with both text and binary files.
     */
    public static void copyFile(String sourceFile, String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            // Create input stream to read from source file
            fis = new FileInputStream(sourceFile);
            
            // Create output stream to write to destination file
            fos = new FileOutputStream(destinationFile);
            
            // Buffer to read data in chunks
            byte[] buffer = new byte[1024];
            int length;
            
            // Read from source and write to destination
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully!");
            System.out.println("Source: " + sourceFile);
            System.out.println("Destination: " + destinationFile);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: IO Exception - " + e.getMessage());
        } finally {
            // Close streams to avoid resource leak
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
    
    /**
     * Alternative method using try-with-resources (Java 7+)
     * Automatically closes streams
     */
    public static void copyFileAutoClose(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            
            byte[] buffer = new byte[1024];
            int length;
            
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully (Auto-close method)!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: IO Exception - " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java FileCopy <source file> <destination file>");
            System.out.println("\nExample: java FileCopy input.txt output.txt");
            
            // Demo with test files
            System.out.println("\n--- Running demo ---");
            
            // Create a sample source file for demonstration
            try {
                FileWriter fw = new FileWriter("sample_source.txt");
                fw.write("This is a sample file.\n");
                fw.write("It contains multiple lines.\n");
                fw.write("This file will be copied.\n");
                fw.close();
                System.out.println("Sample source file created: sample_source.txt");
            } catch (IOException e) {
                System.out.println("Error creating sample file: " + e.getMessage());
            }
            
            // Copy the sample file
            copyFileAutoClose("sample_source.txt", "sample_copy.txt");
            return;
        }
        
        String sourceFile = args[0];
        String destinationFile = args[1];
        
        // Use the auto-close method
        copyFileAutoClose(sourceFile, destinationFile);
    }
}
