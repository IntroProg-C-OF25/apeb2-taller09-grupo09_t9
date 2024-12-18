/***
 * Con el objetivo practicar el uso del ciclo repetitivo for, 
 * se propone que dado un límite, se presenten las siguientes figuras.
 * @author Adrián Cuenca
 */
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int lim;
        System.out.print("DAME EL NIVEL DEL ARBOL: ");
        lim = tcl.nextInt();
        //figura1
        System.out.println("Figura 1");
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < (i+1); j++) {   
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        //figura2
        System.out.println("Figura 2");
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim -i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        //figura3
        System.out.println("Figura 3");
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim -i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i +1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = lim -2; i >= 0; i--) {
            for (int j = 0; j < lim -i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i +1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/***
 * run:
 * DAME EL NIVEL DEL ARBOL: 4
 * Figura 1
 * * 
 * ** 
 * *** 
 * **** 
 * 
 * Figura 2
 *    *
 *   ***
 *  *****
 * *******
 *
 * Figura 3
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 * BUILD SUCCESSFUL (total time: 1 second)
 */
