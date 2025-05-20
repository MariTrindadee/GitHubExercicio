package exercicio3;

public class Exercicio3 {

    public static int maiorValorAbsoluto(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }

        int maior = Math.abs(array[0]);

        for (int i = 1; i < array.length; i++) {
            int valorAbsoluto = Math.abs(array[i]);
            if (valorAbsoluto > maior) {
                maior = valorAbsoluto;
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {-10, 20, -30, 5, 40, -50};
        int resultado = maiorValorAbsoluto(numeros);
        System.out.println("O maior valor absoluto no array é: " + resultado);
    }
}
