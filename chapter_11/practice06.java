
// binary to dacimal

import java.util.*;

public class practice06 {

    public static void binTOdec(int binary_num){
        
        int dacimal = 0;
        int power =0;

        while(binary_num>0){
            
            int lastdigit = binary_num % 10;
            dacimal = dacimal + (lastdigit * (int) Math.pow(2,power));
            binary_num = binary_num /10;
            power++;
        }
        System.out.println("the dacimal number i " + dacimal);
    }
    public static void main(String[] args) {
        System.out.println("enter the binary number ");
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();
        binTOdec(binary_num);
    }
}
