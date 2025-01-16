import java.util.Arrays;
import java.util.Scanner;

public class Clase12 {
    public static void main(String[] args) {
        BusquedaBinaria();
    }

    public static void OrdenarDescendente() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 1) + 1);
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        int aux;
        int j = array.length - 1;

        for (int i = 0; i < j; i++) {
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void BusquedaBinaria(){
/*Actividad: Búsqueda binaria
La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo. */

int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (100));
        }
    Arrays.sort(numeros);
    System.out.println("El arreglo en cuestion: " + Arrays.toString(numeros));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número que desea buscar:");
        int numAdivinado = scanner.nextInt();

        int indice = Arrays.binarySearch(numeros, numAdivinado);

        if (indice >= 0) {
            System.out.println("El número " + numAdivinado + " en encuentra en el indice " + indice);
        } else {
            System.out.println("El número " + numAdivinado + " no se encuentra en el arreglo");
        }
        

        scanner.close();
    }
    
}
