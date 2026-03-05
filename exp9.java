import java.util.*;

public class exp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase().replaceAll(" ", "");
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "PALINDROME" : "NOT palindrome");

        System.out.print("Enter number of names: ");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < sc.nextInt(); i++) {
            names.add(sc.nextLine());
        }
        Collections.sort(names);
        System.out.println("Sorted: " + names);
        sc.close();
    }
}

