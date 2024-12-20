import java.util.Scanner;

public class Clase09 {
    public static void main(String[] args) {

        /*Actividad 1 */
        sumandoElementos();

        /*Actividad 2 */
        promediandoElementos();

        /*Actividad 3 */
        encontrandoMaximo();
    }

    //Actividad 1
    public static void sumandoElementos() {

        /*Actividad: Sumando elementos
Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento. */

int[] array = {26, 06, 2011};

int suma = array[0] + array[1] + array[2];

System.out.println("El resultado de la suma de todos los elementos del arreglo es igual a: " + suma);
    }

    //Actividad 2
    public static void promediandoElementos(){

        int[] array = new int [4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar los elementos del arreglo.");
        System.out.print("Ingrese aquí el primer elemento: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese aquí el segundo elemento: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese aquí el tercer elemento: ");
        int num3 = sc.nextInt();
        System.out.print("Ingrese aquí el cuarto elemento: ");
        int num4 = sc.nextInt();
        float promedio = ((float)(num1 + num2 + num3 + num4) / array.length);
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);

        sc.close(); 
    
    }

    //Actividad 3
    public static void encontrandoMaximo() {
        int[] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar los elementos del arreglo.");
        
        for(int i=0; i<=array.length-1;i++){
            System.out.print("Ingrese aquí el elemento ("+(i+1)+"): ");
            array[i] = sc.nextInt();
        }
        int maximo=array[0];
        for(int i=0; i<=array.length-1;i++){
            if(maximo < array[i]){          
                maximo = array[i];       
            }
        }
        System.out.println("El valor maximo dentro del arreglo es: "+maximo);
        sc.close();
    }
}
