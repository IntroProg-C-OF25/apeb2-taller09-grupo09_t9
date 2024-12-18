
import java.util.Scanner;

/**
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
 * El arreglo almacena el número de elementos que el usuario lo disponga.
 *
 * @author Juan Jose Calva
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Cuantas marcas desea Ingresar?: ");
        int nummarcas = tcl.nextInt();
        tcl.nextLine();

        String[] marcas = new String[nummarcas];
        int contvalidas = 0;

        System.out.println("Ingresa las marcas de los vehiculos :): ");
        for (int i = 0; i < nummarcas; i++) {
            System.out.println("Marca [" + (i + 1) + "]: ");
            String marca = tcl.nextLine();

            char priletra = marca.charAt(0);
            if (priletra == 'A' || priletra == 'a'
                    || priletra == 'C' || priletra == 'c'
                    || priletra == 'T' || priletra == 't') {
                
                System.out.println("Marca invalida porque empieza con '" + priletra + "'.");
                i--;
                
            } else {
                marcas[contvalidas] = marca;
                contvalidas++;
            }
        }

        System.out.println("Marcas de vehiculos validas:");
        for (int i = 0; i < contvalidas; i++) {
            System.out.println("Marca " + (i + 1) + ": " + marcas[i]);
        }

        System.out.println("Total de marcas validas: " + contvalidas);
    }
}
/**
 * run:
 * Cuantas marcas desea Ingresar?: 
 * 5
 * Ingresa las marcas de los vehiculos :): 
 * Marca [1]: 
 * Audi
 * Marca invalida porque empieza con 'A'.
 * Marca [1]: 
 * Mazda
 * Marca [2]: 
 * Hyundai
 * Marca [3]: 
 * Nissan
 * Marca [4]: 
 * Subaru
 * Marca [5]: 
 * Toyota
 * Marca invalida porque empieza con 'T'.
 * Marca [5]: 
 * Chevrolet
 * Marca invalida porque empieza con 'C'.
 * Marca [5]: 
 * Kia
 * Marcas de vehiculos validas:
 * Marca 1: Mazda
 * Marca 2: Hyundai
 * Marca 3: Nissan
 * Marca 4: Subaru
 * Marca 5: Kia
 * Total de marcas validas: 5
 * BUILD SUCCESSFUL (total time: 1 minute 12 seconds)
 */