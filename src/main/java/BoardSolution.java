import java.util.HashSet;
import java.util.Set;

public class BoardSolution {
    public static final int BOARD_SIDE = 9;
    public static final Set <Character> SET_BOARD_ELEMENTS = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '.');
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

    public boolean symbolIsNotInSetBoardElAndInSetBoardRow(char element, Set<Character> setBoardRow, Set<Character> setBoardEl) {
        return (!setBoardEl.contains(element)) || (setBoardRow.contains(element) && (element != '.'));
    }

    public boolean symbolIsNotInSetBoardElAndInSetBoardColumn(char element, Set<Character> setBoardColumn, Set<Character> setBoardEl) {
        return (!setBoardEl.contains(element)) || (setBoardColumn.contains(element) && (element != '.'));
    }

    public String isValidBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIDE; ++i) {
            Set<Character> tmpSetRow = new HashSet<>();
            Set<Character> tmpSetColumn = new HashSet<>();
//            SET_BOARD_ELEMENTS.contains(board[i][j])
            for (int j = 0; j < BOARD_SIDE; ++j) {
                if (symbolIsNotInSetBoardElAndInSetBoardRow(board[i][j], tmpSetRow, SET_BOARD_ELEMENTS)) {
                    return "Matrix is not valid";
                } else {
                    tmpSetRow.add(board[i][j]);
                }

                if (symbolIsNotInSetBoardElAndInSetBoardColumn(board[j][i], tmpSetColumn, SET_BOARD_ELEMENTS)) {
                    return "Matrix is not valid";
                } else {
                    tmpSetColumn.add(board[j][i]);
                }
            }
        }
        return "Matrix is valid";
    }
}
