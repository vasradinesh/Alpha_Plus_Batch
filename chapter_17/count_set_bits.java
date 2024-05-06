public class count_set_bits {

    public static int count_set_bits(int n){
        int cout = 0;
        while (n>0) {
            if((n & 1) != 0){
                cout++;
            }
            n=n>>1;
        }
        return cout;
    }
    public static void main(String args[]){
        System.out.println(count_set_bits(3));
    }
}
