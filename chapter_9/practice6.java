//Check If A Number Is Prime Or Not

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        if(n==2){
            System.out.println("n is prime");
        }
        else{

            for(int i = 2;i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }
    }
}
