import java.util.ArrayList;
import java.util.Scanner;

class Publisher {
    protected String publisherName;
    protected String publisherAddress;
    protected String publisherEmail;
    
    public Publisher(String publisherName, String publisherAddress, String publisherEmail) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherEmail = publisherEmail;
    }
    
    public Publisher() {
        this.publisherName = "";
        this.publisherAddress = "";
        this.publisherEmail = "";
    }
}

class Book extends Publisher {
    protected String bookTitle;
    protected String bookAuthor;
    protected double bookPrice;
    protected int yearOfPublication;
    
    public Book(String bookTitle, String bookAuthor, double bookPrice, int yearOfPublication,
                String publisherName, String publisherAddress, String publisherEmail) {
        super(publisherName, publisherAddress, publisherEmail);
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.yearOfPublication = yearOfPublication;
    }
    
    public Book() {
        super();
        this.bookTitle = "";
        this.bookAuthor = "";
        this.bookPrice = 0.0;
        this.yearOfPublication = 0;
    }
    
    public void display() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Address: " + publisherAddress);
        System.out.println("Publisher Email: " + publisherEmail);
    }
}

class Literature extends Book {
    private String literaryGenre;
    private String language;
    
    public Literature(String bookTitle, String bookAuthor, double bookPrice, int yearOfPublication,
                      String publisherName, String publisherAddress, String publisherEmail,
                      String literaryGenre, String language) {
        super(bookTitle, bookAuthor, bookPrice, yearOfPublication, publisherName, publisherAddress, publisherEmail);
        this.literaryGenre = literaryGenre;
        this.language = language;
    }
    
    public Literature() {
        super();
        this.literaryGenre = "";
        this.language = "";
    }
    
    public void display() {
        System.out.println("========== LITERATURE BOOK ==========");
        super.display();
        System.out.println("Literary Genre: " + literaryGenre);
        System.out.println("Language: " + language);
        System.out.println("=====================================");
    }
}

class Fiction extends Book {
    private String fictionType;
    private String plotSummary;
    
    public Fiction(String bookTitle, String bookAuthor, double bookPrice, int yearOfPublication,
                   String publisherName, String publisherAddress, String publisherEmail,
                   String fictionType, String plotSummary) {
        super(bookTitle, bookAuthor, bookPrice, yearOfPublication, publisherName, publisherAddress, publisherEmail);
        this.fictionType = fictionType;
        this.plotSummary = plotSummary;
    }
    
    public Fiction() {
        super();
        this.fictionType = "";
        this.plotSummary = "";
    }
    
    public void display() {
        System.out.println("========== FICTION BOOK ==========");
        super.display();
        System.out.println("Fiction Type: " + fictionType);
        System.out.println("Plot Summary: " + plotSummary);
        System.out.println("==================================");
    }
}

public class exp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter number of books: ");
                n = sc.nextInt();
                sc.nextLine();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.nextLine();
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Book " + (i + 1) + " ---");
            
            System.out.print("Enter Book Title: ");
            String bookTitle = sc.nextLine();
            
            System.out.print("Enter Book Author: ");
            String bookAuthor = sc.nextLine();
            
            double bookPrice = 0.0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Book Price: ");
                    bookPrice = sc.nextDouble();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine();
                }
            }
            
            int year = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Year of Publication: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.nextLine();
                }
            }
            
            System.out.print("Enter Publisher Name: ");
            String publisherName = sc.nextLine();
            
            System.out.print("Enter Publisher Address: ");
            String publisherAddress = sc.nextLine();
            
            System.out.print("Enter Publisher Email: ");
            String publisherEmail = sc.nextLine();
            
            System.out.print("Enter Category (Literature/Fiction): ");
            String category = sc.nextLine();
            
            if (category.equalsIgnoreCase("Literature")) {
                System.out.print("Enter Literary Genre: ");
                String genre = sc.nextLine();
                
                System.out.print("Enter Language: ");
                String language = sc.nextLine();
                
                books.add(new Literature(bookTitle, bookAuthor, bookPrice, year, 
                                        publisherName, publisherAddress, publisherEmail, genre, language));
            } else if (category.equalsIgnoreCase("Fiction")) {
                System.out.print("Enter Fiction Type: ");
                String fictionType = sc.nextLine();
                
                System.out.print("Enter Plot Summary: ");
                String plotSummary = sc.nextLine();
                
                books.add(new Fiction(bookTitle, bookAuthor, bookPrice, year,
                                     publisherName, publisherAddress, publisherEmail, fictionType, plotSummary));
            } else {
                System.out.println("Invalid category! Book not added.");
                i--;
            }
        }
        
        System.out.println("\n\n========== ALL BOOKS DETAILS ==========\n");
        for (int i = 0; i < books.size(); i++) {
            books.get(i).display();
            System.out.println();
        }
        
        sc.close();
    }
}
/*Enter number of books: 1

--- Book 1 ---
Enter Book Title: Everyday im survive 
Enter Book Author: GK
Enter Book Price: 100
Enter Year of Publication: 2025
Enter Publisher Name: Gayathri
Enter Publisher Address: India
Enter Publisher Email: Gk@gmail.com
Enter Category (Literature/Fiction): Literature
Enter Literary Genre: School
Enter Language: English


========== ALL BOOKS DETAILS ==========

========== LITERATURE BOOK ==========
Book Title: Everyday im survive
Author: GK
Price: 100.0
Year of Publication: 2025
Publisher Name: Gayathri
Publisher Address: India
Publisher Email: Gk@gmail.com
Literary Genre: School
Language: English
=====================================
 */