package tp3_ejercicio6;

import java.util.Scanner;

public class TP3_EJERCICIO6 {

    public static void main(String[] args) {

        Scanner lector = new Scanner (System.in);
        int N = 0;
        int M = 0;
    do{    
        System.out.println("ingrese N y M ambos positivos");
        N = lector.nextInt();
        M = lector.nextInt();
       
        if(N >= M){
            System.out.print("N debe ser menor a M");
        }
               

    } while (M < N || N <= 0 || M <= 0);
    for(int contador =1;contador<=M; contador++){
       
        if(contador% N == 0){
           System.out.println("Multiplos:"+ contador);  
        }
    }
    }
}