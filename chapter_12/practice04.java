
/*
code for print floyd_s_trinagle type of pattern
1 
2 3
4 5 6
7 8 9 10

*/

import java.util.*;

public class practice04 {

    public static void floyd_s_trinagle(int n){
        int counter = 1;
        int i,j;
        // outer loop for line 
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        floyd_s_trinagle(n);
    }
}
