//program that reads a set of integers,and then prints the sum of the odd ane even

import java.util.*;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sumofeven = 0;
        int sumofodd = 0;
        System.out.println("enter number");
        int n = sc.nextInt();
        
        while(i<=n){
            if(i%2==0){
                sumofeven += i;
            }
            else{
                sumofodd += i;
            }
            i++;
        }
        System.out.println("sum of odd number is" + sumofodd);
        System.out.println("sum of even number is" + sumofeven);
    }
}
