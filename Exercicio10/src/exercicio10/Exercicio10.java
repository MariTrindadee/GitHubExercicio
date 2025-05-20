package exercicio10;

public class Exercicio10 {

    public static boolean isFibonacci(int n) {

        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    private static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static void main(String[] args) {
        int num = 21;
        System.out.println(num + " é Fibonacci? " + isFibonacci(num));
    }
}
