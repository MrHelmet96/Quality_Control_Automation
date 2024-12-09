import java.util.Scanner;

public class Clase02 {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Actividad desafio 1 */
        /*System.out.println("Ingrese un número:");
        int num = input.nextInt();

        String resultado = (num % 2 == 0)
        ? "El número es par"
        : "El número es impar";

        System.out.println(resultado);*/

        /*Actividad desafio 2: calcualdora */
        System.out.print("Ingrese un número entero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int num2 = input.nextInt();

        System.out.print("Menú de Opciones:\n"
        + "1. suma\n"
        + "2. resta\n"
        + "3. multiplicación \n"
        + "4. división\n");

        int operacion ;
        do {
            System.out.print("Ingrese qué operación desea realizar: ");
            operacion = input.nextInt();
        } while (operacion != 1 && operacion !=2 && operacion !=3 && operacion !=4);


        double resultado;
        String mensaje = "El resultado de la operación es: ";

        switch(operacion) {
            case 1: resultado = num1 + num2;
            System.out.println(mensaje + (int)resultado);
            break;
            case 2: resultado = num1 - num2;
            System.out.println(mensaje + (int)resultado);
            break;
            case 3: resultado = num1 * num2;
            System.out.println(mensaje + (int)resultado);
            break;
            case 4: resultado = num1 / num2;
            System.out.println(mensaje + (int)resultado);
            break;
            case 5:
            System.out.println("Vuelva pronto!");
        }

        input.close();
    }
}
