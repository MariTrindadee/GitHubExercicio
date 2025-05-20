package exercicio7;

public class Exercicio7 {

    public static int calcularMDC(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;
        int mdc = calcularMDC(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
    }
}
