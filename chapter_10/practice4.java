public class practice4 {
    public static void main(String[] args) {
        char ch = 'A';
        //outer loop
        for(int i=1;i<=4;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
