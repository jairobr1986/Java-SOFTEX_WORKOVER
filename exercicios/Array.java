package exercicios;

public class Array {
    public static void main(String[] args) {
        String[] carros = {"ferrari", "fusca", "camaro", "uno"};
        // indice do array     [0]      [1]       [2]      [3] 
        System.out.println("Tamanho do arrray: " + carros.length);
        System.out.println("Carros: " + carros[2]);
        carros[2] = "Porsche";
        System.out.println("Carros: " + carros[2]);
        System.out.println("_______________________________");
        System.out.println("Carros: ");
        for (int index = 0; index < carros.length; index++) {
            System.out.println(carros[index]);
        }
    }
}
