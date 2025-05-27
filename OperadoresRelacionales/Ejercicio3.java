package OperadoresRelacionales;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args){

        //Implementamos el scanner
        Scanner reader = new Scanner(System.in);
        //Declaramos variables
        double numero1;
        double numero2;
        double numero3;
        //Se solicita ingresar el valor del numero    
        System.out.println("Ingresa el primer numero: ");
        numero1 = reader.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = reader.nextDouble();        
        System.out.println("Ingresa el tercer numero: ");
        numero3 = reader.nextDouble();


        if (numero1>numero2) {
            if (numero1>numero3) {
                System.out.println(numero1+  "es el mayor");    
            }            
        }
        if (numero2>numero1) {
            if (numero2>numero3) {
                System.out.println(numero2+  "es el mayor");    
            }            
        }
        if (numero3>numero2) {
            if (numero3>numero1) {
                System.out.println(numero3+ "es el mayor");    
            }            
        }
}

}
