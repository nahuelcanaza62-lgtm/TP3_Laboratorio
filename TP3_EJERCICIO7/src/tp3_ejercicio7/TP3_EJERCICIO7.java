package tp3_ejercicio7;
import java.util.Scanner;
public class TP3_EJERCICIO7 {

    public static void main(String[] args) {
        
       Scanner lector = new Scanner(System.in);
        double millas;

        do {
            System.out.println("Ingrese la cantidad de millas:");
            millas = lector.nextDouble();

            if (millas != 0) {
                double km = millas * 1.6093;
                System.out.println("Kilómetros: " + km);
            }

        } while (millas != 0);

    }
}