import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase05 {
    
    public static void main(String[] args) {
        /* Actividad 1 */
        //divisionSegura();

        /* Actividad 2 */
        //restaExcepciones();

        /* Actividad 3 */
        //conversionCadenaEntero();
    }

    public static void divisionSegura() {
    /*Actividad 1: Division Segura
    Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla. */
    Scanner input = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;

    try {
        System.out.print("Ingrese un número entero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese un segundo número entero: ");
        num2 = input.nextInt();

        int resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);

    } catch (InputMismatchException e) {
        System.out.println("Pa, te dije que pongas números...");
    } catch(ArithmeticException e) {
        System.out.println("No se puede dividir por cero..." + e.getMessage());
    }
    
    input.close();

    }

    public static void restaExcepciones() {
    /* Actividad 2: Resta con Manejo de Excepciones
    Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta */
    
    try{
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar primer numero: ");
        int num1=teclado.nextInt();
        System.out.println("Ingresar segundo numero: ");
        int num2=teclado.nextInt();

        int resultado=num1-num2;
        System.out.println("El resultado es: "+resultado);
        teclado.close();
    }
    catch(InputMismatchException e)
    {
        System.out.println("El dato ingresado debe ser un numero: "+ e.getMessage());
    }

    }

    public static void conversionCadenaEntero() {
    /*Actividad 3: Conversión de Cadena a Entero
    Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla. */

    try {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        String input = teclado.nextLine();
        System.out.println("Tu numero es: " + Integer.parseInt(input));
        teclado.close();
    } catch (NumberFormatException error) {
        System.out.println("No se ingreso un numero");
    } catch (Exception error) {
        System.out.println("Error: Ups!");
    }
    }
}
