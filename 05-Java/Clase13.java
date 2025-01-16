import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase13 {
    public static void main(String[] args) {
        EjercicioDOS();
    }

    public static void EjercicioUNO() {
        /*Actividad: Verificando si una cadena representa un número válido
Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.
 */

    Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        try {
            double numero = Double.valueOf(cadena);
            System.out.println("La cadena '" + cadena + "' representa el número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena '" + cadena + "' no es un número válido.");
        }
        sc.close();
    }

    public static void EjercicioDOS() {
/*Actividad: Conversión de cadena a número
Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer */

        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        String numString = input.nextLine();

        try {
            int numEntero = Integer.parseInt(numString);
            System.out.println("El numero entero es: " + numEntero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena ingresada no es un número entero válido.");
        }
        input.close();
    }

    public static void EjercicioTRES() {
/*Actividad: Verificando si una cadena contiene solo letras
Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no. */
    }
}
