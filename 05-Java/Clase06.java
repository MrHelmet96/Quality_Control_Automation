import java.util.Scanner;

public class Clase06 {
    public static void main(String[] args) {
        /*Actividad 1 */
        //longitudCadena();

        /*Actividad 2 */
        //concatenacionCadena();

        /*Actividad 3 */
        extraccionSubcadena();
    }

    public static void longitudCadena() {
        /*Actividad: Longitud de Cadena
Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su longitud utilizando el método length() de la clase String. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        int longitud = texto.length();
        System.out.println("La longitud del texto es es: " + longitud);

        // Cerrar el scanner
        scanner.close();
    }

    public static void concatenacionCadena() {
        /*Actividad 2 :Concatenación de Cadenas
    Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String. */

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese su nombre: ");
    String nombre = input.nextLine();
    System.out.print("Ingrese su apellido: ");
    String apellido = input.nextLine();

    System.out.println(nombre.concat(apellido));

    input.close();
    }

    public static void extraccionSubcadena() {
        /*Actividad:Extracción de Subcadena
Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa un número entero: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingresa un segundo número entero: ");
        int n2 = scanner.nextInt();


        System.out.println("el substring del texto es es: " + texto.substring(n1,n2));

        // Cerrar el scanner
        scanner.close();
    }

    public static void busquedaCaracteres() {
        /*Actividad 4: Búsqueda de Caracteres
Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese un caracter: ");
        String character = sc.nextLine();

        int indice = palabra.indexOf(character);

        if (indice == -1){
        System.out.println("el caracter no se encuentra en la cadena");
        }else {
        System.out.println("El caracter si se encuentra " + indice);
        }

        sc.close();
    }
}
