package exemplodesenhas;

public class Main {

    public static void main(String[] args) {
        Validador validador = new Validador();

        String senha = "Abcdef1!";
        boolean valido = validador.isValid(senha);

        System.out.println("Senha válida? " + valido);
    }
}
