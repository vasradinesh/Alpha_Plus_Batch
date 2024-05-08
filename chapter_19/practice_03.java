
//  Print x to the power n 

public class practice_03 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n/2);      //at O(n/2) time complexcity
        int xn = xnm1 * xnm1;
        if(n%2!=0){
            xn = x * xn;
        }
        return xn;
    } 
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        System.out.println(power(x, n));

    }
}
