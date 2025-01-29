package Clase20;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion a calcular de la serie Fibonacci");
        int posicion = sc.nextInt();
        if (posicion == 0) {
            System.out.println("La posicion debe ser un numero positivo mayor a cero");
        } else {
            System.out.println("La posicion Fibonacci que deseas conocer es:  " + Fibo(posicion));
            System.out.println("La posicion recursiva que deseas conocer es:  " + FiboRecursivo(posicion));

        }
        sc.close();
    }

    public static int Fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int siguiente = 0;

        for (int i = 2; i <= n; i++) {
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        return siguiente;
    }

    public static int FiboRecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return FiboRecursivo(n - 1) + FiboRecursivo(n - 2);
    }
}
