import java.util.*;

public class exp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.println("Capacity: " + sb.capacity());

        sb.reverse();
        System.out.println("Reversed and Uppercase: " + sb.toString().toUpperCase());

        System.out.print("Enter string to append: ");
        String str2 = sc.nextLine();
        sb.append(str2);
        System.out.println("After append: " + sb);

        sc.close();
    }
}
