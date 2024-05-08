
public class fibonacci {
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n=30;
        System.out.println(fibonacci(n));
    }
}
