
import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;
        System.out.println("PROD = " + PROD);

        sc.close();  // Fecha o Scanner para evitar resource leak.

    }
}
