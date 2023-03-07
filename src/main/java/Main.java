import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BoardSolution boardSolution = new BoardSolution();
//        char[][] board = boardSolution.readBoard();
        char[][] board = boardSolution.getBoard();
        System.out.println(boardSolution.isValidBoard(board));
    }
}
