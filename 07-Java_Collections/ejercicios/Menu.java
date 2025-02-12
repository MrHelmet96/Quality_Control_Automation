//package 07-Java_Collections.ejercicios;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n¿Qué acción deseas realizar?");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.print("Opción Elegida Nro: ");
            int opcionElegida = scanner.nextInt();
            scanner.nextLine();

            switch (opcionElegida) {
                case 1:
                    System.out.print("Ingresa el nombre del invitado: ");
                    String nombreAgregar = formatoTitulo(scanner.nextLine());
                    registro.agregarInvitado(nombreAgregar);
                    break;
                case 2:

                    System.out.print("Ingresa el nombre del invitado a eliminar: ");

                    String nombreEliminar =

                            formatoTitulo(scanner.nextLine());

                    registro.eliminarInvitado(nombreEliminar);
                    break;
                case 3:
                    registro.mostrarInvitados();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:

                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }

    private static String formatoTitulo(String nombre) {

        return nombre.substring(0, 1).toUpperCase() +

                nombre.substring(1).toLowerCase();
    }
}
