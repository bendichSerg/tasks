import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char[][] boardConsole = new char[9][9];

        //scanf symbol matrix
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                String c = in.next();
                if (c.length() == 1) {
                    boardConsole[i][j] = c.charAt(0);
                }
            }

        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        BoardSolution boardSolution = new BoardSolution();
        if (boardSolution.isValidBoard(board)) {
            System.out.println("Matrix is valid");
        } else {
            System.out.println("Matrix is not valid");
        }
    }
}
