//  Knight’s Tour

public class que_2 {

    public static boolean solver(int board[][], int row, int col, int digit) {
        if (board[row][col] == digit - 1) {
            return true;
        }
        // 2 up 1 right
        int i = row - 2;
        int j = col + 1;
        if (i >= 0 && j < board.length && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < board.length && j >= 0 && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < board.length && j < board.length && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < board.length && j >= 0
                && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < board.length && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }
        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < board.length && j < board.length && board[i][j] == digit + 1) {
            solver(board, i, j, digit + 1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int board[][] = { { 0, 59, 38, 33, 30, 17, 8, 63 },
                { 37, 34, 60, 9, 62, 29, 16 },
                { 58, 1, 39, 32, 27, 18, 7 },
                { 35, 48, 26, 61, 10, 15, 28 },
                { 42, 57, 49, 40, 23, 6, 19 },
                { 47, 50, 54, 25, 20, 11, 14 },
                { 56, 43, 3, 22, 13, 24, 5 },
                { 51, 46, 44, 53, 4, 21, 1 } };
        System.out.print(solver(board, 0, 0, 0));
    }
}
