package OperadoresRelacionales;
import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args) {
        int numero;

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el numero de tu boleto: ");
        numero = reader.nextInt();


        if((numero-93)*3%2==0){
            System.out.println("PREMIADO" +numero );
        }
        else{
            System.out.println("SUERTE PARA LA PRÓXIMA" +numero );
        }
    }
    
}
