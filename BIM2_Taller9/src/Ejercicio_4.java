/**
 *Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética
 * y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author Adrián Cuenca
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        int arribaArit = 0, abajoArit = 0;
        double suma = 0, aritmetica;
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        aritmetica = suma / arreglo.length;
        System.out.printf("La aritmetica es: %.2f", aritmetica);
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > aritmetica){
                arribaArit++;
            }else if (arreglo[i] < aritmetica){
                abajoArit++;
            }
        }
        System.out.println("La cantidad de elementos arriba de la media aritmetica es: " + arribaArit);
        System.out.println("La cantidad de elementos abajo de la media aritmetica es: " + abajoArit);
    }
}
/***
 * run-single:
 * La aritmetica es: 9,54
 * La cantidad de elementos arriba de la media aritmetica es: 8
 * La cantidad de elementos abajo de la media aritmetica es: 5
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */