//write function for find product of a and b
import java.util.*;
public class practice01 {

    public static void productofgivennumber(int a , int b) {
        //function for find product
        int product = a * b;
        System.out.println("product of " + a + " and " + b + " is : " + product);
        return;
    }
    public static void main(String[] args) {
        //main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productofgivennumber(a, b);
    }
}
