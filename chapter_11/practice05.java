//code for write all prime number in given range

import java.util.*;

public class practice05 {
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

    public static void primeinrange(int n){
        int i;
        for(i=1;i<=n;i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeinrange(n); 
    }
}