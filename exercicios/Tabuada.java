package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        teclado.close();
    }
}
