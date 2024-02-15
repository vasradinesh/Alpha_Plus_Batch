//binomial coefficent 
import java.util.*;

public class practice03 {

    public static int factorial(int n){
        int fact = 1;
        for(int i= 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static float Binomial_Coefficent(int n ,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        float Binomial_Coefficent = n_fact/(r_fact*nmr_fact);
        return Binomial_Coefficent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and r ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n==r){
            System.out.println("Binomial_Coefficent = 1");
        }
        else{
            float Binomial_Coefficent = Binomial_Coefficent(n,r);
            System.out.println("binomial coefficent = " + Binomial_Coefficent);
        }
    }
}
