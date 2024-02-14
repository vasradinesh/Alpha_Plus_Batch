//Print Reverse Of given A Number

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int newnumber;
        while(number>0){
            newnumber = number % 10;
            System.out.print(newnumber);
            number = number /10;
        }
    }
}
