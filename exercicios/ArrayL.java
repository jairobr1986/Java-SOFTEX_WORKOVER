package exercicios;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();
        contatos.add("Jairobr1986");
        contatos.add("00 0 0000 0000");
        contatos.add("email@servicos.com");
        contatos.add("funcionario1");
        contatos.add("00 0 0000 0000");
        contatos.add("email123@servicos.com");
        System.out.println("Tamanho do array: " + contatos.size());
        System.out.println(contatos);
        System.out.println("Email Jairobr1986 (indice[2]) " + contatos.get(2));
        System.out.println("_____________________");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i));
        }
    }
}
