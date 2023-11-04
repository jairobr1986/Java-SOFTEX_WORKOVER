package exercicios;

import java.util.Scanner;

public class JoKenPo {

    public static void main(String[] args) {
        int jogador, computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("_________Jokenpô_________");
        System.out.println("");
        System.out.println("1. Pedra.");
        System.out.println("2.Papel.");
        System.out.println("3.Tesoura.");
        System.out.println("Digite a opção desejada:");
        // Lógica
        jogador = teclado.nextInt();
        System.out.println("");
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA");
                break;
            default:
            System.out.println("Opção Inválida");
                break;
        }
        // Lógica do computador
        computador = (int) (Math.random()*3 + 1);
        teclado.close();
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA");
                break;
        }
        // Lógica para determinar o vencedor
        System.out.println("");
        if (jogador == computador) {
            System.out.println("EMPATE");
        } else {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ) {
                System.out.println("JOGADOR VENCEU");
            } else {
                System.out.println("COMPUTADOR VENCEU");
            }
        }
    }
}
