package exercicios;

public class JogoCarta {
    public static void main(String[] args) {
        String[] nipes={"Ouros", "Copas", "Espadas","Paus"};
        String[] faces={"Az", "1", "2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        // As linhas abaixo recupera de forma aleatória o conteudo do arrays
        String nipe = nipes[(int) (Math.random()*4)];
        String face = faces[(int) (Math.random()*faces.length)];
        // A linha abaixo exibe a carta sorteada
        System.out.println(face + " de " + nipe);
    }
}
