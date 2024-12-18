
import java.util.Scanner;

/**
 *El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al 
 * finalizar el ciclo, la Dirección de la carrera de Computación a solicitado 
 * las siguientes estadísticas en función a los promedios obtenidos del ciclo 
 * por estudiantes (use 1 arreglo, no matrices, y para el promedio por
 * estudiante, no ingrese el valor, si se debe autogenerar).
 * 
 * @author Juan Jose Calva
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        double[] promedios = new double[28];
        String[] estudiante = new String[28];

        for (int i = 0; i < estudiante.length; i++) {
            estudiante[i] = "Estudiante " + (i + 1);
        }

        for (int i = 0; i < 28; i++) {
            promedios[i] = Math.random() * 10;

        }

        double sumaTotal = 0;
        for (double promedio : promedios) {
            sumaTotal += promedio;

        }
        double promeciclo = sumaTotal / promedios.length;
        double mejornota = promedios[0], peornota = promedios[0];
        int pmejor = 0, ppeor = 0;

        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > mejornota) {
                mejornota = promedios[i];
                pmejor = i;
            }
            if (promedios[i] < peornota) {
                peornota = promedios[i];
                ppeor = i;
            }
        }
        System.out.printf("Promedio general del ciclo: %.2f\n\n", promeciclo);

        System.out.println("Estudiantes con nota encima del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] > promeciclo) {
                System.out.printf("%s - Promedio: %.2f\n", estudiante[i], promedios[i]);
            }
        }

        System.out.println("Estudiantes con nota debajo del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] < promeciclo) {
                System.out.printf("%s - Promedio: %.2f\n", estudiante[i], promedios[i]);
            }
        }

        System.out.printf("Estudiante con mejor calificacion: %s - Promedio: %.2f\n",
                estudiante[pmejor], mejornota);

        System.out.printf("Estudiante con calificacion mas baja: %s - Promedio: %.2f\n",
                estudiante[ppeor], peornota);

        tcl.close();
    }
}
/**
 * run:
 * Promedio general del ciclo: 4,69

 * Estudiantes con nota encima del promedio:
 
 * Estudiante 1 - Promedio: 9,02
 * Estudiante 3 - Promedio: 5,79
 * Estudiante 4 - Promedio: 5,65
 * Estudiante 6 - Promedio: 7,68
 * Estudiante 8 - Promedio: 8,66
 * Estudiante 11 - Promedio: 8,35
 * Estudiante 12 - Promedio: 5,16
 * Estudiante 13 - Promedio: 5,60
 * Estudiante 14 - Promedio: 5,36
 * Estudiante 16 - Promedio: 6,74
 * Estudiante 17 - Promedio: 9,36
 * Estudiante 20 - Promedio: 6,53
 * Estudiante 22 - Promedio: 6,48
 * Estudiante 24 - Promedio: 5,26
 * Estudiante 25 - Promedio: 8,35
 * Estudiante 27 - Promedio: 5,55
 * Estudiante 28 - Promedio: 4,90
 
 * Estudiantes con nota debajo del promedio:
 
 * Estudiante 2 - Promedio: 2,75
 * Estudiante 5 - Promedio: 0,37
 * Estudiante 7 - Promedio: 0,45
 * Estudiante 9 - Promedio: 1,64
 * Estudiante 10 - Promedio: 2,43
 * Estudiante 15 - Promedio: 2,24
 * Estudiante 18 - Promedio: 2,20
 * Estudiante 19 - Promedio: 0,91
 * Estudiante 21 - Promedio: 0,26
 * Estudiante 23 - Promedio: 2,96
 * Estudiante 26 - Promedio: 0,60
 
 * Estudiante con mejor calificacion: Estudiante 17 - Promedio: 9,36
 * Estudiante con calificacion mas baja: Estudiante 21 - Promedio: 0,26
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */