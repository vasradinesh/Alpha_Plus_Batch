// a program to print the multiplication table of anumber N
import java.util.*;
public class practice9 {
    public static void main(String[] args) {
        int i;
        System.out.println("enter number that you want table");
        Scanner sc = new Scanner(System.in );
        int number =sc.nextInt();
        int multiplication_ans = 1;

        for(i=1;i<=10;i++){

            multiplication_ans = number * i;
            System.out.println(number + "  x  " + i + "  =  " + multiplication_ans );

        }
    }
}
