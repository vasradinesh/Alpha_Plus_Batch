public class practice02 {

    public static void printspiral_matrix(int matrix[][]){
        int start_row = 0;
        int start_coulum = 0;
        int end_row = matrix.length - 1;
        int end_coulum = matrix[0].length - 1;

        while(start_row<=end_row && start_coulum<=end_coulum){
            // Print the first row from the remaining rows
            for(int j=start_coulum;j<=end_coulum;j++){
                System.out.print(matrix[start_row][j] + " ");
            }   
            // Print the last column from the remaining columns
            for(int i=start_row + 1;i<=end_row;i++){
                System.out.print(matrix[i][end_coulum] + " ");
            }
            // Print the last row from the remaining rows
            for(int j=end_coulum-1;j>=start_coulum;j--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(matrix[end_row][j] + " ");
            }
            // Print the first column from the remaining columns
            for(int i=end_row-1;i>=start_row+1;i--){
                if(start_coulum==end_coulum){
                    break;
                }
                System.out.print(matrix[i][start_coulum] + " ");
            }
            start_row++;
            start_coulum++;
            end_row--;
            end_coulum--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printspiral_matrix(matrix);
    }
}
