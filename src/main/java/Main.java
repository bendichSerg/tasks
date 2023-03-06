import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BoardSolution boardSolution = new BoardSolution();
        int N = 9;
        char[][] board = boardSolution.readBoard(N);
        System.out.println(boardSolution.isValidBoard(board));
    }
}
