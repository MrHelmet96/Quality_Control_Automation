package Clase19;

import java.util.Scanner;

public class C19Calculadora {
    
    public static void main(String[] args) {
        menu(); // Llamamos al método para iniciar la calculadora
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú de opciones
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = realizarOperacion(opcion, num1, num2);
                System.out.println("El resultado es: " + resultado);
            } else if (opcion == 5) {
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida, intenta nuevamente.");
            }
        } while (opcion != 5);

        scanner.close(); // Cerramos el scanner al salir del programa
    }

    public static double realizarOperacion(int opcion, double num1, double num2) {
        return switch (opcion) {
            case 1 -> num1 + num2; // Suma
            case 2 -> num1 - num2; // Resta
            case 3 -> num1 * num2; // Multiplicación
            case 4 -> (num2 != 0) ? num1 / num2 : Double.NaN; // División con validación
            default -> 0;
        };
    }
}
