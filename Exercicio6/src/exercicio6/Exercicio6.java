package exercicio6;

public class Exercicio6 {

    public static boolean ehPalindromo(String s) {

        s = s.replace(" ", "").toLowerCase();

        int inicio = 0;
        int fim = s.length() - 1;

        while (inicio < fim) {
            if (s.charAt(inicio) != s.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        String frase = "A man a plan a canal Panama";
        if (ehPalindromo(frase)) {
            System.out.println("\"" + frase + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + frase + "\" não é um palíndromo.");
        }
    }
}
