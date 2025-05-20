
package exercicio9;

public class  Exercicio9 {

   
    public static double calcularPorcentagem(double total, double porcentagem) {
       
        return (total * porcentagem) / 100;
    }

    public static void main(String[] args) {
        double valorTotal = 200;  
        double porcentagem = 15;   

        double resultado = calcularPorcentagem(valorTotal, porcentagem);
        System.out.println("O valor correspondente a " + porcentagem + "% de " + valorTotal + " é: " + resultado);
    }
}
