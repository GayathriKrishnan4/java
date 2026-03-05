import java.util.Scanner;

public class stringop {
    
    static void findLength(String str) {
        System.out.println("Length of string: " + str.length());
    }
    
    static void findCharAt(String str) {
        if (str.length() >= 4) {
            System.out.println("Character at position 2: " + str.charAt(1));
            System.out.println("Character at position 4: " + str.charAt(3));
        } else {
            System.out.println("String is too short");
        }
    }
    
    static void findSubstringStart(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.println("Substring: " + str.substring(start));
    }
    
    static void findSubstringRange(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Substring: " + str.substring(start, end));
    }
    
    static void concatenateString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to concatenate: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated: " + str.concat(str2));
    }
    
    static void replaceCharacter(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter replacement character: ");
        char newChar = sc.next().charAt(0);
        System.out.println("String after replacement: " + str.replace(oldChar, newChar));
    }
    
    static void startsWithString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();
        System.out.println("Starts with '" + prefix + "': " + str.startsWith(prefix));
    }
    
    static void convertToLowercase(String str) {
        System.out.println("Lowercase: " + str.toLowerCase());
    }
    
    static void convertToUppercase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find length");
            System.out.println("2. Character at position 2 and 4");
            System.out.println("3. Substring (start index only)");
            System.out.println("4. Substring (start and end index)");
            System.out.println("5. Concatenate string");
            System.out.println("6. Replace character");
            System.out.println("7. Check if starts with");
            System.out.println("8. Convert to lowercase");
            System.out.println("9. Convert to uppercase");
            System.out.println("10. Exit");
            System.out.print("Choose operation (1-10): ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    findLength(str);
                    break;
                case 2:
                    findCharAt(str);
                    break;
                case 3:
                    findSubstringStart(str);
                    break;
                case 4:
                    findSubstringRange(str);
                    break;
                case 5:
                    concatenateString(str);
                    break;
                case 6:
                    replaceCharacter(str);
                    break;
                case 7:
                    startsWithString(str);
                    break;
                case 8:
                    convertToLowercase(str);
                    break;
                case 9:
                    convertToUppercase(str);
                    break;
                case 10:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
