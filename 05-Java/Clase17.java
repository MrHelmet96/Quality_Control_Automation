import java.util.Scanner;

public class Clase17 {
    public static void main(String[] args) {
        int MAX_ALUMNOS = 100;
        String[] nombres = new String[MAX_ALUMNOS];
        double[] notas = new double[MAX_ALUMNOS];
        int cantidadAlumnos = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                continue;
            }
            
            switch (opcion) {
                case 1: // Registrar alumno
                    if (cantidadAlumnos >= MAX_ALUMNOS) {
                        System.out.println("Error: No se pueden registrar más alumnos.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("Error: El nombre no puede estar vacío.");
                        break;
                    }
                    System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                    try {
                        double nota = Double.parseDouble(scanner.nextLine());
                        if (nota < 0 || nota > 10) {
                            System.out.println("Error: La nota debe estar entre 0.00 y 10.00.");
                            break;
                        }
                        nombres[cantidadAlumnos] = nombre;
                        notas[cantidadAlumnos] = nota;
                        cantidadAlumnos++;
                        System.out.println("Alumno registrado exitosamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número válido para la nota.");
                    }
                    break;
                
                case 2: // Mostrar todos los alumnos
                    if (cantidadAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.println("Lista de alumnos:");
                        for (int i = 0; i < cantidadAlumnos; i++) {
                            System.out.println((i + 1) + ". " + nombres[i] + " - Nota: " + notas[i]);
                        }
                    }
                    break;
                
                case 3: // Mostrar promedio de notas
                    if (cantidadAlumnos == 0) {
                        System.out.println("No hay alumnos registrados para calcular el promedio.");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < cantidadAlumnos; i++) {
                            suma += notas[i];
                        }
                        double promedio = suma / cantidadAlumnos;
                        System.out.println("El promedio de notas es: " + promedio);
                    }
                    break;
                
                case 4: // Buscar alumno por nombre
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    nombre = scanner.nextLine().trim();
                    boolean encontrado = false;
                    for (int i = 0; i < cantidadAlumnos; i++) {
                        if (nombres[i].equalsIgnoreCase(nombre)) {
                            System.out.println("Alumno encontrado: " + nombres[i] + " - Nota: " + notas[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                
                case 5: // Modificar nota por nombre
                    System.out.print("Ingrese el nombre del alumno para modificar su nota: ");
                    nombre = scanner.nextLine().trim();
                    encontrado = false;
                    for (int i = 0; i < cantidadAlumnos; i++) {
                        if (nombres[i].equalsIgnoreCase(nombre)) {
                            System.out.print("Ingrese la nueva nota: ");
                            try {
                                double nuevaNota = Double.parseDouble(scanner.nextLine());
                                if (nuevaNota < 0 || nuevaNota > 10) {
                                    System.out.println("Error: La nota debe estar entre 0.00 y 10.00.");
                                    break;
                                }
                                notas[i] = nuevaNota;
                                System.out.println("Nota actualizada exitosamente.");
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Debe ingresar un número válido.");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                
                case 6: // Eliminar alumno por nombre
                    System.out.print("Ingrese el nombre del alumno a eliminar: ");
                    nombre = scanner.nextLine().trim();
                    encontrado = false;
                    for (int i = 0; i < cantidadAlumnos; i++) {
                        if (nombres[i].equalsIgnoreCase(nombre)) {
                            for (int j = i; j < cantidadAlumnos - 1; j++) {
                                nombres[j] = nombres[j + 1];
                                notas[j] = notas[j + 1];
                            }
                            cantidadAlumnos--;
                            System.out.println("Alumno eliminado exitosamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                
                case 7: // Salir
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Error: Opción no válida.");
            }
        }
    }
}
