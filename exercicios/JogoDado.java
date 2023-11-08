package exercicios;

import java.util.Scanner;

public class JogoDado {
    public static void main(String[] args) {
        char opcao = 's';
        Scanner teclado = new Scanner(System.in);
        // do {
        //     System.out.println("Lançamento do DADO............");
        // } while (opcao == 's');
        while (opcao == 's') {
            System.out.println("Lançamento do DADO............");
            int dado = (int) (Math.random() * 6 + 1) ;
            System.out.println("Face: " + dado);
            System.out.println("Deseja lançar o dado novamente? S/n.");
            opcao = teclado.next() .charAt(0);
        }
    }
}
