//code for given number is  prime number or not


import java.util.*;

public class practice04 {
    public static boolean isprime(int n){
        int i;
        if(n==2){
            return true;
        }
        else{
            for(i=2;i<=Math.sqrt(n);i++){
                if(n%2==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.println(isprime(n));
        
    }
}
