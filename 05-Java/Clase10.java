public class Clase10 {
    public static void main(String[] args) {
        valorMinimo();
    }
    public static void valorMinimo() {
        // Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.

        int[] numeros = {9, 55 ,24 ,3 ,7};

        int minimo = numeros[0];

        for (i = 0; i < numeros.length; i++) {
            if (minimo < numeros[i]){
                minimo = numeros[i];
            }
        }

        System.out.println("El valor más bajo del arreglo es:" + minimo);
    }
}