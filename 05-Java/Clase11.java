import java.util.Scanner;
import java.util.Random;

public class Clase11 {

    public static void main(String[] args) {
        //Menu();

        AdivinaNumero();
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Comprar producto.");
            System.out.println("2. Realizar devolución.");
            System.out.println("3. Ver mis pedidos.");
            System.out.println("4. Preguntas frecuentes.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado: Comprar producto.");
                    break;
                case 2:
                    System.out.println("Has seleccionado: Realizar devolución.");
                    break;
                case 3:
                    System.out.println("Has seleccionado: Ver mis pedidos.");
                    break;
                case 4:
                    System.out.println("Has seleccionado: Preguntas frecuentes.");
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void AdivinaNumero() {
/*Actividad: Adivinando un número 
Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente. */

Scanner scanner = new Scanner(System.in);
Random random = new Random();

int numSecreto = random.nextInt(20) + 1;
int numUsuario;

System.out.println("Pensé un número del 1 al 20. ¿Podrias adivinarlo?");

do {
    System.out.print("Introduce un número: ");
    numUsuario = scanner.nextInt();

    if (numUsuario < numSecreto) {
        System.out.println("El número que pensé es mayor.");
    } else if (numUsuario > numSecreto) {
        System.out.println("El número que pensé es menor.");
    }

} while (numUsuario != numSecreto);

System.out.println("Bien ahí! adivinaste! el número era: " + numSecreto);

scanner.close();
    }

public static void contraseña() {
    Scanner scanner = new Scanner(System.in);
String pass = "secreto";

System.out.println("Ingrese la Contraseña");

while (scanner.nextLine().compareTo(pass) != 0) {
System.out.println("Contraseña Incorrecta");
}

scanner.close();
System.out.println("Bienvenido");
}

public static void conteoDigitos(){

Scanner sc = new Scanner(System.in);

System.out.println("Por favor, ingresa un numero entero: ");

int numero=sc.nextInt();
int contador=0;

numero=Math.abs(numero);

if(numero==0){
contador=1;
}else{

while(numero>0){
numero= numero/10;
contador++;
}
}

System.out.println("El numero tiene " + contador + " digitos" );

sc.close();
}

}