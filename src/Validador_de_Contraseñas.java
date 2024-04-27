import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador_de_Contraseñas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese contraseña (o escriba 'exit' para salir): ");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                break;
            }

            if (validatePassword(password)) {
                System.out.println("La contraseña proporcionada '" + password + "' es válida.");
            } else {
                System.out.println("La contraseña proporcionada no cumple como contraseña '" + password );
            }
        }
    }

    private static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z].*[a-z].*[a-z])(?=.*[A-Z].*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}