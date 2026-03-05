import java.util.*;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display() {
        System.out.println("ENo: " + eNo + ", Name: " + eName + ", Salary: " + eSalary);
    }
}

public class exp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        // Read employee information
        System.out.println("Enter employee details:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ENo: ");
            int eNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String eName = sc.nextLine();

            System.out.print("Enter Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for an employee
        System.out.print("Enter ENo to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("Employee found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }

        sc.close();
    }
}
