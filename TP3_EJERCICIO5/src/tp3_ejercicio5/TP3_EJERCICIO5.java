
package tp3_ejercicio5;

import java.util.Scanner;

public class TP3_EJERCICIO5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int A, B;

      
        do {
            System.out.println("Ingrese A:");
            A = lector.nextInt();
            
            System.out.println("Ingrese B:");
            B = lector.nextInt();

            if (A >= B) {
                System.out.println("Error: A debe ser menor que B");
            }

        } while (A >= B);

  
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}