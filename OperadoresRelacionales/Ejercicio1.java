package OperadoresRelacionales;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args){

        //Implementamos el scanner
        Scanner reader = new Scanner(System.in);
        //Declaramos variables
        int numero1;
        //Se solicita ingresar el valor del numero    
        System.out.println("Ingresa el numero: ");
        numero1 = reader.nextInt();

        if (numero1%2==0) {
            System.out.println("Si es un numero par");             
        }

        else {
            System.out.println("No es un numero par");
        }
    }
}
