public class Fundamentos {
    
public static void main(String[] args) {
    String nome;
    nome = "Jairo Oliveira Santos";
    int idade;
    idade = 37;
    char sexo;
    sexo = 'M';
    double temperatura = 26.7;
    boolean arCondicionado = false;
    System.out.println("USO DE VARIAVEIS EM JAVA");
    System.out.println("Exemplos: ");
    System.out.println("O nome digitado foi: " + nome + " ele tem, " + idade + " anos de idade e, é do sexo: " + sexo);
    System.out.println("Agora faz: " + temperatura + "Graus.");
    System.out.println("O AR CONDICIONADO" + arCondicionado);
    System.out.println("________________________");
    System.out.println("");
    double i = 10;
    System.out.println("Operadores Aritimeticos e Atribuições");
    System.out.println("Exemplos: ");
    System.out.println("i = " + i);
    System.out.println("i = " + i + " + 5 | i = " + (i + 5));
    System.out.println("i = " + i + " - 5 | i = " + (i - 5));
    System.out.println("i = " + i + " * 5 | i = " + (i * 5));
    System.out.println("i = " + i + " / 5 | i = " + (i / 5));
    System.out.println("i = " + i + " % 5 | i = " + (i % 5));
    System.out.println("i += 5   | i = " + (i += 5));
    System.out.println("i -= 5   | i = " + (i -= 5));
    System.out.println("i *= 5   | i = " + (i *= 5));
    System.out.println("i /= 5   | i = " + (i /= 5));
   i++;
   System.out.println("i++      | i = " + i);
   i--;
   System.out.println("i--      | i = " + i);
System.out.println("------------------------------");
System.out.println("ESTRUTURAS DE CONTROLE");
System.out.println("");
System.out.println("ESTRUTURAS DE CONTROLES CONDICIONAIS");
System.out.println("");
System.out.println("Exemplo 1 - Uso do 'IF'");
if (sexo == 'M') {
    System.out.println("Alistamento MILITAR");
}

System.out.println("-------------------------");
System.out.println("EXEMPLO 2 Uso das condicionais");
System.out.println("");
if (idade > 18) {
    System.out.println("Você tem " + idade +  " e é maior de idade e pode se alistar.");
}
if (idade < 18) {
    System.out.println("Você não tem idade para se alistar.");
}
System.out.println("");
System.out.println("---------------------------");
System.out.println("EXEMPLO 3 Uso de condicionais ");
System.out.println("");
if (idade < 16) {
    System.out.println("PROIBIDO VOTAR");
}
else if (idade >= 18 && idade <= 70) {
    System.out.println("VOCÊ TEM " + idade + " ANOS, O SEU VOTO É OBRIGATÓRIO");
}
else if (idade == 16 || idade == 17 || idade > 70) {
    System.out.println("O SEU VOTO É FACULTATIVO");
}
System.out.println("");
System.out.println("---------------------------");
System.out.println("EXEMPLO 4 Uso DO switch case ");
System.out.println("");
System.out.println("1. CADASTRO DE CLIENTES");
System.out.println("2. CADASTRO DE USUARIOS");
System.out.println("3. RELATORIOS");
int opcao = 7;
switch (opcao) {
    case 1:
    System.out.println("CLIENTES");
    break;
    case 2:
    System.out.println("USUARIOS");
    break;
    case 3:
    System.out.println("RELATÓRIOS");
    break;
    default:
    System.out.println("Opção inválida");
    break;

}

System.out.println("---------------------------");
System.out.println("");
System.out.println("ESTRUTURAS DE REPETIÇÃO");
System.out.println("");
System.out.println("---------------------------");
System.out.println("EXEMPLO 5 Uso DO for ");
System.out.println("");
for (int j = 10; j > 0; j --) {
    System.out.println(j);
}
for (int tabuada = 0; tabuada <= 10; tabuada ++) {
    System.out.println("");
    for (int valor = 0; valor <= 10; valor ++){
        System.out.println(tabuada + "X" + valor + " = " + (tabuada * valor));

    }

}

System.out.println("ESTRUTURAS DE REPETIÇÃO");
System.out.println("");
System.out.println("---------------------------");
System.out.println("EXEMPLO 6 Uso DO while ");
System.out.println("");
int contador = 1;
while (contador <= 10) {
    System.out.println(contador);
    contador++;
}

System.out.println("ESTRUTURAS DE REPETIÇÃO");
System.out.println("");
System.out.println("---------------------------");
System.out.println("EXEMPLO 7 Uso DO while ");
System.out.println("");
char novoJogo;
do { 
    System.out.println("Deseja jogar novamente(s/n)?");
    novoJogo = 'n';
    } while (novoJogo == 's');
    System.out.println("GAME OVER");

        
}

    
}
