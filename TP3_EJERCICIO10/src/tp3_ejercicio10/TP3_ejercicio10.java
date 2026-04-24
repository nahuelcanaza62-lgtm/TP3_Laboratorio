
package tp3_ejercicio10;
import java.util.Scanner;

public class TP3_ejercicio10 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double pago = 5;
        double total = 0;
        int meses;

        System.out.println("Ingrese cantidad de meses:");
        meses = lector.nextInt();

        for(int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pago);

            total = total + pago;

            pago = pago * 2;
        }

        System.out.println("La cantidad total es " + total);
    }
}

  



