/**
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 * @author Adrián Cuenca
 */
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim, fibonacciAnt = 1, fibonacciAct = 1, numActual = 2, fibonacciSig;
        System.out.print("DAME UN LIMITE PARA LA SERIE: ");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            while (true) {
                boolean esPrimo = true;
                for (int j = 2; j <= numActual / 2; j++) {
                    if (numActual % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    break;
                }
                numActual++;
            }
            System.out.print(fibonacciAnt + "/" + numActual);
            if (i < lim - 1) {
                System.out.print(", ");
            }
            fibonacciSig = fibonacciAnt + fibonacciAct; fibonacciAnt = fibonacciAct; fibonacciAct = fibonacciSig;
            numActual++;
        }
    }
}
/***
 * run-single:
DAME UN LIMITE PARA LA SERIE: 10
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23, 55/29BUILD SUCCESSFUL (total time: 3 seconds)
 */