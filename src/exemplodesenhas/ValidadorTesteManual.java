package exemplodesenhas;

public class ValidadorTesteManual {

    public static void main(String[] args) {
        Validador validador = new Validador();

        String senha = "Abcdef2-";
        boolean resultado = validador.isValid(senha);

        System.out.println("Senha válida? " + resultado);
    }
}
