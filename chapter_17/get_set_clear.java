

public class get_set_clear {

    public static int  getiTHbit(int n ,int i){
        int bitmask = (1<<i);
        if((n&bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setiTHbit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int cleariTHbit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    // clear last ith bits
    public static int clear(int n ,int i){ 
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    //clear in range 
    public static int clearinRANGE(int n ,int i,int j){
        int a = (~0)<<j;
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(getiTHbit(2,1));
        System.out.println(setiTHbit(10,2));
        System.out.println(cleariTHbit(10,2));
        System.out.println(clear(15,2));
        System.out.println(clearinRANGE(10, 2, 4));
    }
}
