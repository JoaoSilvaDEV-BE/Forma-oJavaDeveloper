
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        //TODO: Complete os espaços em branco com uma possível solução para o desafio 
        soma = A + B;

        System.out.println("SOMA = " + soma);
        sc.close();  // Fecha o Scanner para liberar recursos
    }
}
