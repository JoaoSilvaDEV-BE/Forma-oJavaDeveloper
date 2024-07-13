import java.util.Date;

public class operadores1 {
    // Classes Operadores.java

    String nome = "Joao";
    int idade = 24;
    double peso = 75.0;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    // Concatenação de texto
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + " " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}
