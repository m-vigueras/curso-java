package OperadoresRelacionales;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        int numero1,numero2,numero3,menor,mayor;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        numero1 = leer.nextInt();

        System.out.println("Ingresa el segundo numero");
        numero2 = leer.nextInt();

        System.out.println("Ingresa el tercer numero");
        numero3 = leer.nextInt();

        if(numero1>numero2){
            if (numero1>numero3){
                mayor = numero1;
                if(numero2 < numero3){
                    menor = numero2;
                }
                else{
                    menor = numero3;
                }
            }
            else{
                mayor = numero3;
                menor = numero1;
            }
        }
        else {
            if (numero2>numero3) {
                mayor = numero2;
                if(numero1 < numero3){
                    menor = numero1;
                }
                else{
                    menor = numero3;
                }
            }
            else{
                mayor = numero3;
                menor = numero1;
            }
        }
                System.out.println("El mayor es: "+mayor);
         
                System.out.println("El menor es:"+menor);
       
  }
}


