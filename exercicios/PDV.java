package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

    public static void main(String[] args) {
      // variaveis
        double total, desconto, totalDesconto, valorPago, troco;
        // objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        // entrada1
        System.out.println("PDV");
        System.out.print("Valor total: ");
        total = teclado.nextDouble();
        System.out.print("Desconto(%): ");
        desconto = teclado.nextDouble();
        // processamento1
        totalDesconto = total - (desconto * total) / 100;
        // saída
        System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
        // entrada2
        System.out.println("=======================");
        System.out.print("Valor pago em dinheiro: ");
        valorPago =teclado.nextDouble();
        // processamento2
        troco = valorPago - totalDesconto;
        // saída
        System.out.println("Troco: R$ " + formatador.format(troco));
        teclado.close();
    }
}
