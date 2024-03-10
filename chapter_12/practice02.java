
/*

code for print this type of pattern
   *
  **
 ***
****

*/

import java.util.*;

public class practice02 {

    public static void invertes_roteted_half_pyramid(int totrow){
        int i,j,k;
        //outer loop
        for(i=1;i<=totrow;i++){
            //loop for spaces
            for(j=1;j<=totrow-i;j++){
                System.out.print(" ");
            }
            // loop for print "*" 
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totrow = sc.nextInt();
        invertes_roteted_half_pyramid(totrow);
    }
}
