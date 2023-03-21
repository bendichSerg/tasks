import java.util.Scanner;

public class PrimeNumberSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPrimeNumber(in.nextInt()));
    }
    public static boolean isPrimeNumber (int a) {
        if ((a % 2 != 0) && (a != 1)) {
            for (int i = 3; i < a; i+=2){
                if ((a % i) == 0)
                    return false;
            }
            return true;
        } else return a == 2;
    }
}
