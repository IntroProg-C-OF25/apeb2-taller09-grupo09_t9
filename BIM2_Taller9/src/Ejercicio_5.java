/**
 * Dados los siguientes arreglos
 * @author Juan Jose Calva
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        
        double[] promedio = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", 
                                "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediocualitativo = new String[7];

        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i] >= 0 && promedio[i] <= 5.9) {
                promediocualitativo[i] = "Regular";
            } else if (promedio[i] >= 6 && promedio[i] <= 8.9) {
                promediocualitativo[i] = "Bueno";
            } else if (promedio[i] >= 9 && promedio[i] <= 10) {
                promediocualitativo[i] = "Sobresaliente";
            }
        }
        
        System.out.println("Reporte de promedios");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n",
                              estudiantes[i], promedio[i], promediocualitativo[i]);
        }
    }
}
/**
 * run:
 * Reporte de promedios
 * Kimberly Gonzalez promedio: 10,00 promedio cualitativo: Sobresaliente
 * Mark Hogan promedio: 10,00 promedio cualitativo: Sobresaliente
 * Teresa Martinez promedio: 9,10 promedio cualitativo: Sobresaliente
 * Julia Johnson promedio: 7,00 promedio cualitativo: Bueno
 * Mark Cook promedio: 6,10 promedio cualitativo: Bueno
 * Jennifer Manning promedio: 4,00 promedio cualitativo: Regular
 * Juan Vasquez promedio: 8,00 promedio cualitativo: Bueno
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */