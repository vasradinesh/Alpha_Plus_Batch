public class N_queens {

    public static boolean issafe(char[][] boards, int raw, int coulm) {
        // diagonal left up
        for (int i = coulm - 1, j = raw - 1; i >= 0 && j >= 0; i--, j--) {
            if (boards[j][i] == 'q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = raw - 1, j = coulm + 1; i >= 0 && j < boards.length; i--, j++) {
            if (boards[i][j] == 'q') {
                return false;
            }
        }
        // vertical up
        for (int j = raw - 1; j >= 0; j--) {
            if (boards[j][coulm] == 'q') {
                return false;
            }
        }
        return true;

    }

    static void printboards(char[][] boards) {
        System.out.println("---------------- chess board -----------------");
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                System.out.print(boards[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Nqueens(char boards[][], int raw) {
        //base
        if (raw == boards.length) {
            printboards(boards);
            return;
        }
        
        for (int j = 0; j < boards.length; j++) {
            if (issafe(boards, raw, j)) {
                boards[raw][j] = 'q';
                Nqueens(boards, raw + 1);
                boards[raw][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char boards[][] = new char[n][n];
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                boards[i][j] = 'X';
            }
            System.out.println();
        }
        Nqueens(boards, 0);
    }
}
