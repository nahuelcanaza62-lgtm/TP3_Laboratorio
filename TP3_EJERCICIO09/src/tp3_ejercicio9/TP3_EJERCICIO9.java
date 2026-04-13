
package tp3_ejercicio9;

import java.util.Scanner;

public class TP3_EJERCICIO9 {

  
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
   double  a; 
   int b; 
    System.out.println("ingrese numero real:");
    a = lector.nextDouble();
       do{  
    System.out.println("ingrese numero positivo:");
       b = lector.nextInt();
         if( b<=0){
         System.out.println("vuelva a ingresar numero positivo:");
         }
     }while(b<=0 );
    int base = (int) a;
    int exponente = b;
    long resultado = 1;
    for (int i = 0; i < exponente; i++) {
      resultado *= base; 
}
System.out.println(resultado);
       }
    }

  
