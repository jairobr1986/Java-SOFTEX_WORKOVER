package exercicios;

public class Array2 {
    public static void main(String[] args) {
        String[] [] agenda = {{"José", "91234-1234","teste@gmail.com"},{"Bill", "2222-2222", "bill@hotmail.com"},{"Linua", "98888-7777","linua@outlook.com"}};
        // A linha abaixo recupera o telefone
        // System.out.println(agenda[0][1]);
        // as estruturas abaixo percorre os indices dos arrays
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("______________________");
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i] [j]);
            }
        }
    }
}
