interface Billable {
    double calculate();
}

class Product implements Billable {
    int id;
    String name;
    int quantity;
    double unitPrice;

    Product(int id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public double calculate() {
        return quantity * unitPrice;
    }
}

public class exp17 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "A", 2, 25);
        Product p2 = new Product(102, "B", 1, 100);

        System.out.println("Order No. Date : Product");
        System.out.println("Id\tName\tQuantity\tunit price\tTotal");
        System.out.println(p1.id + "\t" + p1.name + "\t" + p1.quantity + "\t" + p1.unitPrice + "\t" + p1.calculate());
        System.out.println(p2.id + "\t" + p2.name + "\t" + p2.quantity + "\t" + p2.unitPrice + "\t" + p2.calculate());
        double net = p1.calculate() + p2.calculate();
        System.out.println("Net. Amount " + net);
    }
}

/*PS C:\Users\MCA\Desktop\gautham> javac exp17.java
PS C:\Users\MCA\Desktop\gautham> java exp17
Order No. Date : Product
Id      Name    Quantity        unit price      Total
101     A       2       25.0    50.0
102     B       1       100.0   100.0
Net. Amount 150.0 */