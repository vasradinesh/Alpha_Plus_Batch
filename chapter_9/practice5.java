// Reverse The Given Number
public class practice5 {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        while(num>0){
            int lastdigit = num%10;
            rev = (rev*10) + lastdigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
