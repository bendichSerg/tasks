import java.util.Scanner;

public class PalindromSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrom(in.nextInt()));
    }
    public static boolean isPalindrom (int a) {
        int b = a;
        int tmp = 0;
        if (a % 10 != 0) {
            while (b > 0) {
                tmp += b % 10;
                tmp *= 10;
                b /= 10;
            }
        } else {
            return false;
        }
        tmp /= 10;
        return tmp == a;
    }
}
