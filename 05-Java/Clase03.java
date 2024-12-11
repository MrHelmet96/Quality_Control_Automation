/* Actividad 1: Clasificación de Números
En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla. */

/*Actividad 2: Practicando con estructuras de control
En este ejercicio de calificación, tu tarea es escribir un programa que solicite al
usuario ingresar un número entre 0 y 100. Luego, el programa validará el número
ingresado y mostrará la calificación correspondiente según la siguiente escala:
● Si la puntuación está entre 90 y 100, se mostrará "A".
● Si la puntuación está entre 80 y 89, se mostrará "B".
● Si la puntuación está entre 70 y 79, se mostrará "C".
● Si la puntuación está entre 60 y 69, se mostrará "D".
● Si la puntuación es menor a 60, se mostrará "F".
● Si el usuario ingresa un número que no está dentro del rango establecido (es
decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario
que el número ingresado está fuera del rango válido. */

/*Actividad 3: Divisibilidad
En esta actividad, escribirás un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla. */

/*Actividad 4: Cálculo de Descuento
En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento. */

import java.util.Scanner;

public class Clase03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Actividad 1 */
        /*System.out.print("Ingrese un número: ");
        int num = input.nextInt();

        if (num != 0) {
            if (num < 0) {
                System.out.println("El numero ingresado es positivo");
            } else {
                System.out.println("El numero ingresado es negativo");
            }
        } else {
            System.out.println("El numero ingresado es cero");
        }*/

        /*============================================================ */

        /*Actividad 2 */
        /*System.out.print("Por favor ingresa la puntuación (entre 0 y 100): ");
        int pntcion = input.nextInt();
        String calificacion = "";

        if (pntcion >= 90 && pntcion <= 100) {
            calificacion = "A";
        } else if (pntcion >= 80 && pntcion <= 89) {
            calificacion = "B";
        } else if (pntcion >= 70 && pntcion <= 79) {
            calificacion = "C";
        } else if (pntcion >= 60 && pntcion <= 69) {
            calificacion = "D";
        } else if (pntcion >= 0 && pntcion <= 59) {
            calificacion = "F";
        } else {
            System.out.println("La calificación ingresada es invalida");
        }

        System.out.println("Su calificación es: " + calificacion);*/

        /*============================================================ */

        /*Actividad 3 */
        /*System.out.print("Ingrese un número: ");
        int num = input.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("El número es divisible por 5 y 3");
        } else if (num % 5 == 0) {
            System.out.println("El número es divisible por 5");
        } else if (num % 3 == 0) {
            System.out.println("El número es divisible por 3");
        } else {
            System.out.println("El número no es divisible por 5 ni por 3");
        }*/

        /*============================================================ */

        /*Actividad 4 */
        System.out.print("Ingrese el precio del producto: ");

        double precio = input.nextDouble();
        double descuento = 0.10;
        double precioDescuento = 0;

        if (precio >= 100) {
            precioDescuento = precio - (precio * descuento);
            System.out.println("El precio con descuento es: " + precioDescuento);
        } else {
            System.out.println("Este producto no tiene descuento. El precio es: " + precio);
        }

        input.close();
    }
}
