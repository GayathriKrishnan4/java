public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
/*Enter the number of positive integers (N): 3
Enter number 1: 5
Enter number 2: -2
Exception: Negative number entered: -2
Enter number 3: 10
Average of positive numbers: 7.5 */