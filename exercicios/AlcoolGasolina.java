package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {
    
    public static void main(String[] args) {
        // variaveis
        double alcool, gasolina;
        // objetos
        Scanner teclado = new Scanner(System.in);
        // entrada
        System.out.println("Ácool X Gaolina");
        System.out.print("Digite o valor do álcool: ");
        alcool = teclado.nextDouble();
        System.out.print("Digite o valor da Gasolina: ");
        gasolina = teclado.nextDouble();
        // processamento
        if (alcool < 0.7 * gasolina) {
            System.out.println("Abastecer com Álcool");
        } else {
            System.out.println("Abastecer com Gasolina");
        }
        teclado.close();
    }
}
