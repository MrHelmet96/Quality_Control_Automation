//  Actividad: Estadísticas de calificaciones
/*Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.

Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.

Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por último, imprimiré los resultados en consola.*/

import java.util.Random;
import java.util.Arrays;

public class ActividadIntegradora {
    public static void main(String[] args) {
        String[] calificaciones = new String[10];
        Random random = new Random();
        double[] calificacionesDouble = new double[10];
        double[] desaprobados = new double[10];
        double[] aprobados = new double[10];
        double[] excelentes = new double[10];
        double promedioCalificaciones = 0;
        double promedioDesaprobados = 0;
        double promedioAprobados = 0;
        double promedioExcelentes = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(random.nextInt(11));
            calificacionesDouble[i] = Double.parseDouble(calificaciones[i]);
            promedioCalificaciones += calificacionesDouble[i];
        }

        promedioCalificaciones /= calificaciones.length;

        int j = 0;
        int k = 0;
        int l = 0;

        for (int i = 0; i < calificacionesDouble.length; i++) {
            if (calificacionesDouble[i] < 4) {
                desaprobados[j] = calificacionesDouble[i];
                promedioDesaprobados += desaprobados[j];
                j++;
            } else if (calificacionesDouble[i] >= 4 && calificacionesDouble[i] < 10) {
                aprobados[k] = calificacionesDouble[i];
                promedioAprobados += aprobados[k];
                k++;
            } else {
                excelentes[l] = calificacionesDouble[i];
                promedioExcelentes += excelentes[l];
                l++;
            }
        }

        promedioDesaprobados /= j;
        promedioAprobados /= k;
        promedioExcelentes /= l;

        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
        System.out.println("Desaprobados: " + Arrays.toString(desaprobados));
        System.out.println("Promedio de desaprobados: " + promedioDesaprobados);
        System.out.println("Aprobados: " + Arrays.toString(aprobados));
        System.out.println("Promedio de aprobados: " + promedioAprobados);
        System.out.println("Excelentes: " + Arrays.toString(excelentes));
        System.out.println("Promedio de excelentes: " + promedioExcelentes);
    }
}