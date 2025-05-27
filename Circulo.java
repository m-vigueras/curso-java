import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){

        //Implementamos el scanner
        Scanner reader = new Scanner(System.in);
        //Declaramos variables
        double radio;
        //Se solicita ingresar el valor del radio    
        System.out.println("Ingresa el radio del circulo en centimetros: ");
        radio = reader.nextInt();
        double radio2 = radio*radio;
        double area = Math.PI*radio*radio;
        //Imprimimos el resultado
        System.out.println("El area del circulo es:" +area+  "cm" ) ;
    }
}
