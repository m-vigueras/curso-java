package OperadoresRelacionales;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        int antigüedad,salario;
        double nuevoSalario = 0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingresa la antigüedad del empleado en meses: ");
        antigüedad = reader.nextInt();

        System.out.println("Ingresa el salario del empleado: ");
        salario = reader.nextInt();

        if (antigüedad > 48){ 
            if (salario < 6490) {
                nuevoSalario = salario * 1.23;
            }
            else {
                System.out.println("El empleado no tiene derecho a un incremento del 23% porque su salario es mayor o igual a $6490.");
            }
            System.out.println("El empleado si tiene derecho a un icremento del 23% y su nuevao salrio es: $" + nuevoSalario);       
        }
        else {
            System.out.println("El empleado no tiene derecho a aumento por su antigüedad de " + antigüedad + " meses.");
        }
    }
}