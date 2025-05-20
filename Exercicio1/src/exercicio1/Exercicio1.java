
package exercicio1;



  public class Exercicio1 {

    public static boolean NumeroPerfeito(int numero) {
        if (numero <= 1) return false;

        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        int numero = 6;
        System.out.println(numero + " é perfeito? " + NumeroPerfeito(numero));
    }
}
