package OperadoresRelacionales;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int numero1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el numero de tu boleto: ");
        numero1 = reader.nextInt();


        if(numero1*93%2==0){
            System.out.println("El boleto es ganador");
        }
        else{
            System.out.println("El boleto no es ganador");
        }
    }
    
}
