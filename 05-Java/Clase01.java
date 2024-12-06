/* Actividad UNO: Usando la Clase Scanner
1. Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
2. Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
3. Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.

Actividad DOS: Operaciones básicas
1. Declara dos variables, y asígnales un valor a cada una de ellas.
2. Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
3. Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola.

Actividad TRES: Usando los operadores de comparación
1. Pide al usuario que ingrese dos números, y:
A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.

2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
*/


import java.util.Scanner;

public class Clase01 {
    public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);

/* ACTIVIDAD UNO*/
        /*System.out.println("Ingrese su nombre: ");
        String nombre = miScanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = miScanner.nextInt();

        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);*/

/* Actividad DOS */
        /*int num1 = 30;
        int num2 = 3;

        System.out.println("La suma de las 2 variables es: " + (num1 + num2));
        System.out.println("La resta de las 2 variables es: " + (num1 - num2));
        System.out.println("La multiplicación de las 2 variables es: " + (num1 * num2));
        System.out.println("La división de las 2 variables es: " + (num1 / num2));
        System.out.println("El módulo de las 2 variables es: " + (num1 % num2));

        System.out.println("Ingrese un número: ");
        int num3 = miScanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int num4 = miScanner.nextInt();

        System.out.println("La suma de los números ingresados es: " + (num3 + num4));*/


/* Actividad TRES */
        System.out.println("Ingrese un número: ");
        int num5 = miScanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int num6 = miScanner.nextInt();

        if (num5 > num6) {
            System.out.println("El primer número ingresado es mayor al segundo número ingresado.");
        } else 
            System.out.println("El primer número ingresado no es mayor al segundo número ingresado.");
        

        if (num5 != num6) {
            System.out.println("El primer número ingresado es distinto al segundo número ingresado.");
        } else {
            System.out.println("El primer número ingresado no es distinto al segundo número ingresado.");
        }

        if (num5 % 2 == 0) {
            System.out.println("El primer número ingresado es divisible por 2.");
        } else {
            System.out.println("El primer número ingresado no es divisible por 2.");
        }

        System.out.println("Ingrese un número: ");
        int num7 = miScanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int num8 = miScanner.nextInt();

        System.out.println("Ingrese un número: ");
        int num9 = miScanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int num10 = miScanner.nextInt();

        if (num7 > num8 && num9 > num10) {
            System.out.println("El número 1 es mayor al número 2 y el número 3 es mayor al número 4.");
        } else {
            System.out.println("El número 1 no es mayor al número 2 y el número 3 no es mayor al número 4.");
        }

        if (num7 > num8 || num9 > num10) {
            System.out.println("El número 1 es mayor al número 2 o el número 3 es mayor al número 4.");
        } else {
            System.out.println("El número 1 no es mayor al número 2 o el número 3 no es mayor al número 4.");
        }

miScanner.close();
    }
}



