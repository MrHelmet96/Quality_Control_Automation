package modelos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            
            if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            }
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rect = new Rectangulo(ancho, alto);
                    rect.imprimirDatos();
                    break;
                case 2:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    Triangulo tri = new Triangulo(base, altura);
                    tri.imprimirDatos();
                    break;
                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circ = new Circulo(radio);
                    circ.imprimirDatos();
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
