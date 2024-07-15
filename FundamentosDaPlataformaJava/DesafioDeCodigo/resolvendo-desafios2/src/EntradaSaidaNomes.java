
import java.util.Scanner;

public class EntradaSaidaNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[]{"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"};

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }
        System.out.println(nomes);

    }
