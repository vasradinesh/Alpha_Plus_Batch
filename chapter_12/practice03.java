
/*
code for print this type of pattern
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.util.*;

public class practice03 {

    public static void invertes_half_pyramid_withnumber(int totrow){
        // outer loop
        int i,j;
        for(i=1;i<=totrow;i++){
            // innner-number loop
            for(j=1;j<=totrow-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totrow = sc.nextInt();
        invertes_half_pyramid_withnumber(totrow);
    }
}
