//factoril of given number 
import java.util.*;

public class practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;
            
            while (i <= number) {
                factorial *= i; // Multiply factorial by i
                i++; // Increment i
            }
            
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
