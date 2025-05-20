package exercicio4;

public class Exercicio4 {

    public static int contarVogais(String s) {
        int contagem = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contagem++;
            }
        }
        return contagem;
    }

    public static String stringComMaisVogais(String[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }

        String resultado = array[0];
        int maiorVogais = contarVogais(resultado);

        for (int i = 1; i < array.length; i++) {
            int vogaisAtual = contarVogais(array[i]);
            if (vogaisAtual > maiorVogais) {
                maiorVogais = vogaisAtual;
                resultado = array[i];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        String[] palavras = {"banana", "abacaxi", "morango", "uva"};
        String resultado = stringComMaisVogais(palavras);
        System.out.println("A string com o maior número de vogais é: " + resultado);
    }
}
