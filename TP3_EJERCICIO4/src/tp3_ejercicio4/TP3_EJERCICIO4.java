package tp3_ejercicio4;
import java.util.Scanner;

public class TP3_EJERCICIO4 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int A, B;

        System.out.println("Ingrese dos valores:");
        A = lector.nextInt();
        B = lector.nextInt();

       
        while(A == B) {
            System.out.println("Son iguales, ingrese valores distintos:");
            A = lector.nextInt();
            B = lector.nextInt();
        }

   
        int menor, mayor;

        if(A < B) {
            menor = A;
            mayor = B;
        } else {
            menor = B;
            mayor = A;
        }

    
        int i = menor;

        while(i <= mayor) {
            System.out.println("Valor contador = " + i);
            i++;
        }

    }
}
  /*
    do{
     int A = lector.nextInt();
        int B = lector.nextInt();
        System.out.println("Ingrese dos numeros: ");
   
}while(A == B);
   
    }

*/