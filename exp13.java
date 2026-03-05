import java.util.Scanner;

class Employee {
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;
    
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    
    public Employee() {
        this.empId = 0;
        this.name = "";
        this.salary = 0.0;
        this.address = "";
    }
}

class Teacher extends Employee {
    private String department;
    private String subjectsTaught;
    
    public Teacher(int empId, String name, double salary, String address, 
                   String department, String subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }
    
    public Teacher() {
        super();
        this.department = "";
        this.subjectsTaught = "";
    }
    
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

public class exp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter number of teachers: ");
                n = sc.nextInt();
                sc.nextLine();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.nextLine();
            }
        }
        
        Teacher[] teachers = new Teacher[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Teacher " + (i + 1) + " ---");
            
            int empId = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.nextLine();
                }
            }
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            double salary = 0.0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine();
                }
            }
            
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            
            System.out.print("Enter Subjects Taught: ");
            String subjects = sc.nextLine();
            
            teachers[i] = new Teacher(empId, name, salary, address, department, subjects);
        }
        
        System.out.println("\n\n--------- TEACHER DETAILS--------\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Teacher " + (i + 1) + ":");
            teachers[i].display();
        }
        
        sc.close();
    }
}
/*-- Enter details for Teacher 1 ---
Enter Employee ID: 101
Enter Name: ria
Enter Salary: 10000
Enter Address: pune
Enter Department: cs
Enter Subjects Taught: maths

--- Enter details for Teacher 2 ---
Enter Employee ID: 102
Enter Name: pete
Enter Salary: 12000
Enter Address: delhi
Enter Department: it
Enter Subjects Taught: it


--------- TEACHER DETAILS--------

Teacher 1:
Employee ID: 101
Name: ria
Salary: 10000.0
Address: pune
Department: cs
Subjects Taught: maths
Teacher 2:
Employee ID: 102
Name: pete
Salary: 12000.0
Address: delhi
Department: it
Subjects Taught: it */