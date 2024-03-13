
//2d array find the largest element

import java.util.*;


public class practice01 {

    public static void largestelement(int matrix[][],int n,int m){
        int largest = Integer.MIN_VALUE;
    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>largest)
                largest = matrix[i][j];
            }
        }
        System.out.println("largest element of matrix is : " + largest);
    }
    
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length,m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largestelement(matrix,n,m);
    }
}
