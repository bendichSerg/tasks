import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoardSolution {
    public static final int BOARD_SIDE = 9;
    public static final char[] SET_BOARD_ELEMENTS = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
    public static final int POWER_SET_BOARD_ELEMENTS = 10;
    protected boolean isSymbolInBoardSet(char symbol) {
        for (int i = 0; i < POWER_SET_BOARD_ELEMENTS; ++i) {
            if (symbol == SET_BOARD_ELEMENTS[i])
                return true;
        }
        return false;
    }

    public char[][] getBoard() {
        return new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    }

    protected boolean isBoardDigitSymbLocatedInRowOrColumn(char symbol, char[][] board, int columnNum, int rowNum) {
        if (symbol != '.')
            for (int i = columnNum + 1, j = rowNum + 1; i < BOARD_SIDE || j < BOARD_SIDE; ++i, ++j) {
                if ((i < BOARD_SIDE) && (symbol == board[i][rowNum])) {
                    return false;
                }
                if ((j < BOARD_SIDE) && (symbol == board[columnNum][j])) {
                    return false;
                }
            }
        return true;
    }

    public String isValidBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIDE; ++i) {
            for (int j = 0; j < BOARD_SIDE; ++j) {
                if (!(isSymbolInBoardSet(board[i][j]) &&
                        isBoardDigitSymbLocatedInRowOrColumn(board[i][j], board, i, j))) {
                    return "Matrix is not valid";
                }
            }
        }
        return "Matrix is valid";
    }
}
