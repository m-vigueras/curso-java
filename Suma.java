import java.util.Scanner;

public class Suma {
    public static void main(String[] args){

        //Implementamos el scanner
        Scanner reader = new Scanner(System.in);
        //Declaramos variables
        int numero1;
        int numero2;
        int numero3;
        //Se solicita ingresar los numeros
        System.out.println("Ingresa el primer numero: ");
        numero1 = reader.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = reader.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        numero3 = reader.nextInt();
        //Imprimimos el resultado

        System.out.println("El resultado de la suma es: "+(numero1+numero2+numero3));
    }
}
