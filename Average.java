import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of positive integers (N): ");
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (num < 0) {
                try {
                    throw new NegativeNumberException("Negative number entered: " + num);
                } catch (NegativeNumberException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            } else {
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No positive numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        }
        sc.close();
    }
}