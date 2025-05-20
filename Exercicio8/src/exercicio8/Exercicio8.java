package exercicio8;

public class Exercicio8 {

    public static int[] inverterArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }

        return arrayInvertido;
    }

    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = inverterArray(arrayOriginal);

        System.out.print("Original: ");
        for (int num : arrayOriginal) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Invertido: ");
        for (int num : arrayInvertido) {
            System.out.print(num + " ");
        }
    }
}
