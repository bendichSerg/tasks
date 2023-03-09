public class Main {
    public static void main(String[] args) {
        BoardSolution boardSolution = new BoardSolution();
        char[][] board = boardSolution.getBoard();
        System.out.println(boardSolution.isValidBoard(board));
    }

}
