package exemplodesenhas;

import java.util.regex.Pattern;

public class Validador {

    public boolean isValid(String password) {
        if (password == null) return false;
        if (password.length() < 8) return false;
        if (password.contains(" ")) return false;
        if (!Pattern.compile("[A-Z]").matcher(password).find()) return false;
        if (!Pattern.compile("[0-9]").matcher(password).find()) return false;
        if (!Pattern.compile("[!@#$%^&*()]").matcher(password).find()) return false;

        return true;
    }

    public static void main(String[] args) {
        Validador validador = new Validador();

        String senha = "Abcdef1!";
        boolean valido = validador.isValid(senha);

        System.out.println("Senha válida? " + valido);
    }
}
