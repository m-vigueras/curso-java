import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){

        //Implementamos el scanner
        Scanner reader = new Scanner(System.in);
        //Declaramos variables
        int centigrados;
        double fahrenheit;
        //Se solicita ingresar los numeros
        
        System.out.println("Ingresa la temperatura en grados centigrados: ");
        centigrados = reader.nextInt();
        //Declaramos las variables para calcular las conversiones

        fahrenheit = (double) centigrados*9/5+32;
        double kelvin = (double) centigrados+273.15;
        //Imprimimos el resultado

        System.out.println("Equivalente en Fahrenheit: "+fahrenheit);
        System.out.println("Equivalente en Kelvin: "+kelvin);
    }
}
