package Clase20;

import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Error: No se puede calcular el factorial de un número negativo.");
        } else {
            System.out.println("Factorial (iterativo) de " + numero + " es: " + factorialIterativo(numero));
            System.out.println("Factorial (recursivo) de " + numero + " es: " + factorialRecursivo(numero));
        }

        scanner.close();
    }

    // Método iterativo con do-while
    public static int factorialIterativo(int n) {
        int resultado = 1;
        int contador = n;

        if (n == 0)
            return 1; // 0! = 1

        do {
            resultado *= contador;
            contador--;
        } while (contador > 0);

        return resultado;
    }

    // Método recursivo
    public static int factorialRecursivo(int n) {
        if (n == 0 || n == 1)
            return 1; // Caso base
        return n * factorialRecursivo(n - 1); // Llamada recursiva
    }
}
