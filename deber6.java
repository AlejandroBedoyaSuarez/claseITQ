import java.util.Date;
import java.util.Scanner;

public class deber6 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);
        // Instrucción
        System.out.println(
                "Programa que permita dar las respuestas de las variables x and y en un sistema de ecuaciones lineales");
        
        Scanner ecuaciones= new Scanner(System.in);
        System.out.println("Escriba el valor a : ");
        double valorA= ecuaciones.nextDouble();
        System.out.println("Escriba el valor b : ");
        double valorB = ecuaciones.nextDouble();
        System.out.println("Escriba el valor c : ");
        double valorC = ecuaciones.nextDouble();
        System.out.println("Escriba el valor d : ");
        double valorD = ecuaciones.nextDouble();
        System.out.println("Escriba el valor e : ");
        double valorE = ecuaciones.nextDouble();
        System.out.println("Escriba el valor f : ");
        double valorF = ecuaciones.nextDouble();
        
        double resultadoX = valorC*valorE-valorB*valorF;
        double resultadoX2 = valorA*valorE-valorB*valorD;
        double resultadoXtotal= resultadoX/resultadoX2;

        double resultadoY = valorA*valorF-valorC*valorD;
        double resultadoY2 = valorA*valorE-valorB*valorD;
        double resultadoYtotal = resultadoY/resultadoY2;
        
        System.out.println("El resultado de x es :" + resultadoXtotal + " , además el valor de y es : " + resultadoYtotal);

        ecuaciones.close();
    }
}
