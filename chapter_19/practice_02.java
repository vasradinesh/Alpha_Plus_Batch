
// factorial using recursion

public class practice_02 {
    public static int  factorial(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n*factorial(n-1);
        return fact;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
