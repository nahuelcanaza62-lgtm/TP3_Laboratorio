package tp3_ejercicio6;

import java.util.Scanner;

public class TP3_EJERCICIO6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int N, M;

      
        do {
            System.out.println("Ingrese N:");
            N = lector.nextInt();
            
            System.out.println("Ingrese M:");
            M = lector.nextInt();
                  if (N <= 0 || M <= 0) {
                System.out.println("Error: deben ser números positivos");
                  } else if (N >= M) {
                System.out.println("Error: N debe ser menor que M");
            }

        } while (N >= M);

  
        for (int i = N; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
}