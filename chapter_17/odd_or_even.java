

public class odd_or_even {
    public static void oddOReven(int n){
        int bitmask =1;
        if((n&bitmask) ==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        oddOReven(0);
        oddOReven(5);
    }
}
