
/**
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario
 * ingrese por teclado una letra que coincida con la primera letra de los "nombres"
 * contenidos en del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer
 * el arreglo estudiantes, y no quemar de forma constante dichas iniciales, imagine que
 * estudiantes podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 *
 * @author Calva y Calva
 */
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.print("Ingrese una letra: ");
            inicial = entrada.nextLine();
            for (String estudiante : estudiantes) {
                if(estudiante.charAt(0) == inicial.charAt(0)){
                    System.out.print("Coincide con: " + estudiante);
                    System.out.println(" ");
                    bandera = false;
                    break;
                }
            }
            if(bandera){
                System.out.print("No se encuentran coincidencias");
                System.out.println(" ");
            }
        }
        System.out.print("FIN");
        System.out.println(" ");
    }
}
/***
 * run-single:
 * Ingrese una letra: Y
 * No se encuentran coincidencias 
 * Ingrese una letra: W
 * No se encuentran coincidencias 
 * Ingrese una letra: A
 * Coincide con: Alcides 
 * FIN 
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */