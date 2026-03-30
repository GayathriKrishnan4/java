import java.io.*;

public class SeparateEvenOdd {
    
    /**
     * Reads integers from input file and separates them into even and odd files
     */
    public static void separateNumbers(String inputFile, String evenFile, String oddFile) {
        BufferedReader br = null;
        PrintWriter evenWriter = null;
        PrintWriter oddWriter = null;
        
        int evenCount = 0;
        int oddCount = 0;
        
        try {
            // Create reader for input file
            br = new BufferedReader(new FileReader(inputFile));
            
            // Create writers for even and odd files
            evenWriter = new PrintWriter(new FileWriter(evenFile));
            oddWriter = new PrintWriter(new FileWriter(oddFile));
            
            String line;
            
            // Read each line from input file
            while ((line = br.readLine()) != null) {
                line = line.trim();
                
                // Skip empty lines
                if (line.isEmpty()) {
                    continue;
                }
                
                try {
                    // Parse the integer
                    int number = Integer.parseInt(line);
                    
                    // Check if even or odd
                    if (number % 2 == 0) {
                        evenWriter.println(number);
                        evenCount++;
                    } else {
                        oddWriter.println(number);
                        oddCount++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Warning: '" + line + "' is not a valid integer. Skipping...");
                }
            }
            
            System.out.println("Numbers separated successfully!");
            System.out.println("Input file: " + inputFile);
            System.out.println("Even numbers: " + evenCount + " (written to " + evenFile + ")");
            System.out.println("Odd numbers: " + oddCount + " (written to " + oddFile + ")");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: IO Exception - " + e.getMessage());
        } finally {
            // Close all resources
            try {
                if (br != null) br.close();
                if (evenWriter != null) evenWriter.close();
                if (oddWriter != null) oddWriter.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
    
    /**
     * Alternative method using try-with-resources (Java 7+)
     */
    public static void separateNumbersAutoClose(String inputFile, String evenFile, String oddFile) {
        int evenCount = 0;
        int oddCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintWriter evenWriter = new PrintWriter(new FileWriter(evenFile));
             PrintWriter oddWriter = new PrintWriter(new FileWriter(oddFile))) {
            
            String line;
            
            while ((line = br.readLine()) != null) {
                line = line.trim();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                try {
                    int number = Integer.parseInt(line);
                    
                    if (number % 2 == 0) {
                        evenWriter.println(number);
                        evenCount++;
                    } else {
                        oddWriter.println(number);
                        oddCount++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Warning: '" + line + "' is not a valid integer. Skipping...");
                }
            }
            
            System.out.println("Numbers separated successfully!");
            System.out.println("Input file: " + inputFile);
            System.out.println("Even numbers: " + evenCount + " (written to " + evenFile + ")");
            System.out.println("Odd numbers: " + oddCount + " (written to " + oddFile + ")");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: IO Exception - " + e.getMessage());
        }
    }
    
    /**
     * Creates a sample input file with integers for demonstration
     */
    public static void createSampleInputFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            int[] numbers = {15, 24, 37, 48, 52, 63, 71, 80, 92, 100, 
                            11, 22, 33, 44, 55, 66, 77, 88, 99, 10};
            
            for (int number : numbers) {
                writer.println(number);
            }
            writer.close();
            System.out.println("Sample input file created: " + filename);
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String inputFile, evenFile, oddFile;
        
        // Check if arguments are provided
        if (args.length < 3) {
            System.out.println("Usage: java SeparateEvenOdd <input file> <even output file> <odd output file>");
            System.out.println("\nExample: java SeparateEvenOdd numbers.txt even.txt odd.txt");
            
            // Run demo with sample files
            System.out.println("\n--- Running demo ---");
            inputFile = "numbers.txt";
            evenFile = "even_numbers.txt";
            oddFile = "odd_numbers.txt";
            
            // Create sample input file
            createSampleInputFile(inputFile);
        } else {
            inputFile = args[0];
            evenFile = args[1];
            oddFile = args[2];
        }
        
        // Separate the numbers
        separateNumbersAutoClose(inputFile, evenFile, oddFile);
    }
}
/*Input file: numbers.txt
Even numbers: 11 (written to even_numbers.txt)
Odd numbers: 9 (written to odd_numbers.txt) */