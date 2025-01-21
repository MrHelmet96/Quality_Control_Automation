import java.util.Random;
import java.util.Scanner;

public class Clase14 {
    
    public static void main(String[] args) {
        generarContraseña();
    }

    public static void generarContraseña() {
        // invocando el scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo longitud de la contraseña
        System.out.print("¿qué longitud desea que tenga la contraseña? ");
        int longitud = sc.nextInt();

        //inicializando y declarando la contraseña
        char [] password = new char[longitud];

        Random random = new Random();

        //Variables bandera para la verificación
        boolean mayus = false;
        boolean minus = false;
        boolean digit = false;

        //generar la contraseña hasta que cumpla con los requisitos
        do {
            for (int i = 0; i < longitud; i++) {
                password[i] = (char) (random.nextInt(95) + 32);
                if (Character.isUpperCase(password[i])) {
                    mayus = true;
                }
                if (Character.isLowerCase(password[i])) {
                    minus = true;
                }
                if (Character.isDigit(password[i])) {
                    digit = true;
                }
            }
        } while (mayus != true && minus != true && digit != true);
        

        //Imprimir contraseña
        String contra = new String(password);
        System.out.println(java.util.Arrays.toString(password));
        System.out.println(contra);


        sc.close();
    }
}
