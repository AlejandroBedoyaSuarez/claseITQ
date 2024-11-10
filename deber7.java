import java.util.Scanner;
import java.util.Date;

public class deber7 {
    public static void main(String[] args) {
        Date fecha= new Date();
        System.out.println(fecha);

        System.out.println("Realizado por Alejandro Bedoya");

        System.out.println("Instrucción : Escribir un programa que lea dos números y visualice el mayor, implementar la\r\n" + //
                        "solución mediante métodos con retorno.");

        Scanner scansito = new Scanner(System.in);

        System.out.print("Escribir un número: ");
        if (!scansito.hasNextDouble()) {
            System.out.println("Error: Loco, dijimos solo números. Ponte serio ");
            scansito.close();
            return;
        }
        double numero1 = scansito.nextDouble();

        System.out.print("Escriba su segundo número: ");
        if (!scansito.hasNextDouble()) {
            System.out.println("Error: Loco, dijimos solo números. Ponte serio ");
            scansito.close();
            return;
        }
        double numero2 = scansito.nextDouble();
       double respuesta = mayorMenor(numero1 , numero2);
       System.out.println("Verificación de números y la respuesta es : " + respuesta);
        
        scansito.close();
    }

    public static double mayorMenor(double a1 , double b2) {
        if (a1>=b2) {
            System.out.println("El número mayor es : " + a1);
            return a1;
        } else if (b2>=a1) {
            System.out.println("El número mayor es : " + b2);
            return b2;
        } 
        return mayorMenor(a1, b2); 
    }

}
