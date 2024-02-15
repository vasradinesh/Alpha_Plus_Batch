//find factorial

import java.util.*;

public class practice02 {

    public static void factorial(int num){

        //function of factorial
        
        int i = 1;
        int fact = 1;
        if(num==0){
            System.out.println("factorial of " + num + " is : " + fact);
        }
        else{
            while(i<=num){
                fact = fact * i;
                i++;
            }
            System.out.println("factorial of " + num + " is : " + fact);
        }
    }
    public static void main(String[] args) {

        //main function
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);

    }
}
