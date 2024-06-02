public class sudoku {

    public static boolean issafe(int sudoku[][], int row, int digit, int col) {
        // vrtical
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // horigental
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // for grid
        int sraw = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = sraw; i < sraw + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        int nextraw = row, nextcol = col + 1;
        if (nextcol == 9) {
            nextraw = row + 1;
            nextcol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextraw, nextcol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, digit, col)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextraw, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false ;

    }
    public static void printsudoku(int sudoku[][]){
        for(int j=0;j<sudoku.length;j++){
            if(j%3==0 && j!=0){
                System.out.println("------------------");
            }
            for(int i=0;i<9;i++){
                if(i%3==0 && i!=0){
                    System.out.print("|");
                }
                System.out.print(sudoku[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7, },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
            if(sudokusolver(sudoku, 0, 0)){
                printsudoku(sudoku);
            }
            else{
                System.out.println("solution is not exist");
            }
    }
    
}
