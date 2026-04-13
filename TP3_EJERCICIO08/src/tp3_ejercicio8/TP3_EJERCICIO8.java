package tp3_ejercicio8;
import java.util.Scanner;
public class TP3_EJERCICIO8 {
    public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
       
        char caracter;
       
        do {
            System.out.println("Ingrese careacter :");
       
            caracter = lector.nextLine().charAt(0);
           
            if((caracter == 'a' )|| (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')){
              System.out.println("El caracter es vocal");
 




            }else{
               System.out.println("El caracter no es vocal");
            }
        }
        while (caracter != '0' );  
       
}
}


