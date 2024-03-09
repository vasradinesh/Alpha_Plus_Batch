
// dacimal to binary

import java.util.*;

public class practice07 {

    public static void decTObin(int decnum){
        int mynum = decnum;
        int binary = 0;
        int pow = 0;
        while(decnum>0){
            int rem = decnum % 2;
            binary = binary + (rem * (int) Math.pow(10,pow));
            pow++;
            decnum = decnum/2;
        }
        System.out.println("binary of " + mynum + " = " + binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dacimal num" );
        int decnum = sc.nextInt();
        decTObin(decnum);
    }
}
