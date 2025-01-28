import java.util.Scanner;

public class Clase18dos {
    /*Tabla de multiplicar

En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente. */

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[3];

        pedirNumero(numeros);

        imprimirTablaMultiplicar(numeros);
        sc.close();
    }

    public static void pedirNumero(int[] numeros) {
        System.out.println("Ingrese 3 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
    }

    public static void imprimirTablaMultiplicar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j=1; j<=10; j++){
                System.out.println(numeros[i] + " x " +  j+" = " + (numeros[i] * j));
            }
            System.out.println(" ---- ");
        }
        
    }

    
}
