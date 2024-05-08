

public class practice_01 {

    public static void numberINC(int n){ 
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        numberINC(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
         int n =10;
         numberINC(n);
    }
}
