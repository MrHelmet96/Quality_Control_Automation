/*Actividad 1: Ejercicio de Días de la Semana
En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa. */

/*Actividad 2: Conversión de Calificaciones
En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
1: "Muy deficiente"
2: "Deficiente"
3: "Suficiente"
4: "Notable"
5: "Sobresaliente" */

/*Actividad 3: Selección de Opción
En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
Opción 1: "Guardar"
Opción 2: "Cargar"
Opción 3: "Salir"
El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada. */

/*Actividad 4: Selección de Figura Geométrica
Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. Estos datos serán:
Para el círculo: el radio.
Para el cuadrado: el lado.
Para el triángulo: la base y la altura.
Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada */

/*Actividad 5: Verificación de Día Hábil
En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes). */

import java.util.Scanner;

public class Clase04 {
    public static void main(String[] args) {

        /* Actividad 1 */
        /* diasSemana(); */

        /* Actividad 2 */
        /* conversionCalificacion(); */

        /* Actividad 3 */
        /*menuOpciones();*/

        /* Actividad 4 */
        /*figuraGeometrica();*/

        /*Actividad 5 */
        diasHabiles();
    }

    /* Actividad 1 */
    public static void diasSemana() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = input.nextInt();
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };

        System.out.println("El día seleccionado es: " + nombreDia);

        input.close();
    }

    /* Actividad 2 */
    public static void conversionCalificacion() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int calificacion = input.nextInt();
        String calificacionTexto = switch (calificacion) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Calificación inválida";
        };

        System.out.println("La calificación en texto es: " + calificacionTexto);

        input.close();
    }

    /* Actividad 3 */
    public static void menuOpciones() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Guardar\n 2. Cargar\n 3. Salir");
        System.out.println("Ingrese una opcion (del 1 al 3):");

        int seleccion = input.nextInt();

        String opcion = switch (seleccion) {
            case 1 -> "Usted seleccionó GUARDAR.";
            case 2 -> "Usted seleccionó CARGAR";
            case 3 -> "Usted seleccionó SALIR.";
            default -> "Esta opcion es incorrecta";
        };

        System.out.println(opcion);

        input.close();
    }

    /* Actividad 4 */
    public static void figuraGeometrica() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo\n2. Cuadrado\n3. Triángulo");
        int figura = input.nextInt();

        double area = switch (figura) {
            case 1 -> {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = input.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                yield area;
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = input.nextDouble();
                area = Math.pow(lado, 2);
                yield area;           
            }
            case 3 -> {
                System.out.print("Ingrese la base del triángulo: ");
                double base = input.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = input.nextDouble();
                area = (base * altura) / 2;
                yield area;
            }
            default -> 0;
        };

        System.out.println("El área de la figura seleccionada es: " + area);

        input.close();
    }

    /* Actividad 5*/
    public static void diasHabiles() {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Que día es hoy?");
        String dia = input.nextLine();

        String esHabiloNo = switch(dia) {
            case "lunes","martes","miercoles","jueves","viernes" -> "Andá a al laburar";
            case "sábado","domingo" -> "Usted puede descansar";
            default -> "Ese dia no existe, escribí bien...";
        };

        System.out.print("hoy es: " + dia + ". " + esHabiloNo);

        input.close();
    }
}
