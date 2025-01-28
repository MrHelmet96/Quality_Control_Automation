import java.util.Scanner;

public class Clase18 {

    // Obtener datos: Perfeccionando la actividad de “imprimir datos”, no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        String nombre = obtenerNombre();

        int edad = obtenerEdad();

        imprimirNombreYEdad(nombre, edad);

        sc.close();
    }

    public static String obtenerNombre(){
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static int obtenerEdad(){
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        return edad;
    }

    public static void imprimirNombreYEdad(String nombre, int edad){
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

}