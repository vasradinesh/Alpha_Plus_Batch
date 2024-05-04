
//search in sorted matrix using staircase search

public class practice04 {

    public static boolean staircasesearch(int matrix[][],int key){
        int row =matrix.length-1,col=0;
        while (row>=0 && col<matrix[0].length) {
            if(matrix[row][col]==key){
                System.out.println("key at endex (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("key is not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key = 3;
        staircasesearch(matrix, key);
    }
}
