import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BoardSolution {
    public static final int BOARD_SIDE = 9;
    public static final Set<Character> SET_BOARD_ELEMENTS =
            new HashSet<>(List.of(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '.'}));

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

    public String isValidBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIDE; ++i) {
            Set<Character> tmpSetRow = new HashSet<>();
            Set<Character> tmpSetColumn = new HashSet<>();
            for (int j = 0; j < BOARD_SIDE; ++j) {
                if ((!SET_BOARD_ELEMENTS.contains(board[i][j]))
                        && (tmpSetRow.contains(board[i][j])
                        && (board[i][j] != '.'))) {
                    return "Matrix is not valid";
                } else {
                    tmpSetRow.add(board[i][j]);
                }

                if ((!SET_BOARD_ELEMENTS.contains(board[j][i]))
                        && (tmpSetColumn.contains(board[j][i])
                        && (board[j][i] != '.'))) {
                    return "Matrix is not valid";
                } else {
                    tmpSetColumn.add(board[j][i]);
                }
            }
        }
        return "Matrix is valid";
    }
}
