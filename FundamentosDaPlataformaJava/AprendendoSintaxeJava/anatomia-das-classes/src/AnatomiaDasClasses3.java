public class AnatomiaDasClasses3 {
    public static void main(String[] args) {
        String primeiroNome = "João Paulo";
        String segundoNome = "Silva";

        String nomeCompleto = nomeClompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeClompleto(String primeiroNome, String segundoNome) {
        return "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
