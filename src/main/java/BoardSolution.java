import java.util.Scanner;

public class BoardSolution {
    public static void main(String[] args) {
        char[][] boardConsole = new char[9][9];

        //scanf symbol matrix
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j){
                String c = in.next();
                if(c.length() == 1){
                    boardConsole[i][j] = c.charAt(0);
                }
            }

        char[][] board =    {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidBoard(board));
        System.out.println(isValidBoard(boardConsole));
    }
    //return true if symbol x in char array a, else false
    public static boolean inStr (char x, char[] a, int N){
        for (int i = 0; i < N; ++i){
            if (x == a[i])
                return true;
        }
        return false;
    }
    //return true if the element 'a' corresponds to the conditions of the matrix 'board', else false
    public static boolean inConditions(char a, char[][] board, int N, int i, int j){
        for (int k = i + 1; k < N; ++k) {
            if ((a != '.') && (a == board[k][j])){
                return false;
            }
        }
        for (int k = j + 1; k < N; ++k) {
            if ((a != '.') && (a == board[i][k])){
                return false;
            }
        }
        return true;
    }
    //return true if the matrix is valid according to the underlying rules, else false
    public static boolean isValidBoard(char[][] board) {
        int N = 9;
        char[] conditions = new char[] {'1','2','3','4','5','6','7','8','9','.'};
        for (int i = 0; i < N; ++i){
            for (int j = 0; j < N; ++j){
                if (!(inStr(board[i][j], conditions, 10) && inConditions(board[i][j], board, N, i, j))){
                    return  false;
                }
            }
        }
        return true;
    }
}
