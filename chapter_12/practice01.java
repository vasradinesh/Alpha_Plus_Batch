
/*
print hollowrwnctengle

****
*  *
*  *
*  *
****

*/

import java.util.*;
public class practice01 {

    public static void hollowrectengle(int totrow , int totcoulum){
        int i,j;
        for(i=1;i<=totrow;i++){
            for(j=1;j<=totcoulum;j++){
                // cell (i,j)
                if(i==1 || i==5 || j==1 || j==4){
                    //boundary
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter totrow ");
        int totrow = sc.nextInt();
        System.out.println("enter totcoulum ");
        int totcoulum = sc.nextInt();
        hollowrectengle(totrow, totcoulum);
    }
}

