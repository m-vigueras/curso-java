package OperadoresRelacionales;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double saldo, nuevoSaldo, faltante;

        System.out.println("Ingresa el saldo de la cuenta: ");
        Scanner reader = new Scanner(System.in);
        saldo = reader.nextDouble();

        if (saldo>=13951.00) {
            nuevoSaldo = saldo - 13951.00;
            System.out.println("El saldo de la cuenta es mayor o igual a $13951.00, el nuevo sald despues de la compra del articulo es: $" + nuevoSaldo); 
        }
        else{
            faltante = 13951.00 - saldo;
            System.out.println("El saldo de la cuenta es menor a $13951.00, le faltan: $" + faltante + " para llegar al mínimo requerido para comprar el articulo.");
        }

    }
    
}
