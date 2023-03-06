import java.util.Scanner;

public class BoardSolution {
    //return true if symbol x in char array a, else false
    public boolean isSymbolInSymbArr(char symbol, char[] symbolArr, int N) {
        for (int i = 0; i < N; ++i) {
            if (symbol == symbolArr[i])
                return true;
        }
        return false;
    }

    public char[][] readBoard(int N) {
        char[][] board = new char[N][N];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                String c = in.next();
                if (c.length() == 1) {
                    board[i][j] = c.charAt(0);
                }
            }
        return board;
    }

    //return true if the element 'a' corresponds to the conditions of the matrix 'board', else false
    public boolean isBoardDigitSymbLocatedInRowOrColumn(char symbol, char[][] board, int N, int columnNum, int rowNum) {
        for (int k = columnNum + 1; k < N; ++k) {
            if ((symbol != '.') && (symbol == board[k][rowNum])) {
                return false;
            }
        }
        for (int k = rowNum + 1; k < N; ++k) {
            if ((symbol != '.') && (symbol == board[columnNum][k])) {
                return false;
            }
        }
        return true;
    }

    //return true if the matrix is valid according to the underlying rules, else false
    public String isValidBoard(char[][] board) {
        int N = 9;
        char[] conditions = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (!(isSymbolInSymbArr(board[i][j], conditions, 10) &&
                        isBoardDigitSymbLocatedInRowOrColumn(board[i][j], board, N, i, j))) {
                    return "Matrix is not valid";
                }
            }
        }
        return "Matrix is valid";
    }
}
