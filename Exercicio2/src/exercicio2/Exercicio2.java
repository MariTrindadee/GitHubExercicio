package exercicio2;

public class Exercicio2 {

    public static String substituirVogais(String entrada) {
        char[] caracteres = entrada.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                caracteres[i] = '*';
            }
        }

        String resultado = "";
        for (int i = 0; i < caracteres.length; i++) {
            resultado += caracteres[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        String texto = "Escola";
        String resultado = substituirVogais(texto);
        System.out.println("Original: " + texto);
        System.out.println("Modificada: " + resultado);
    }
}
