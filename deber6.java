import java.util.Date;
import java.util.Scanner;

public class deber6 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);
       
        System.out.println("Realizado por Alejandro Bedoya");
       
        // Instrucción
        System.out.println(
                "Programa que permita dar las respuestas de las variables x and y en un sistema de ecuaciones lineales");
        
        //hacemos el objeto para el scan del usuario
        Scanner ecuaciones= new Scanner(System.in);
        //hacemos escribir las variables hasta la F
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
        
        //Operación numerador X
        double resultadoX = valorC*valorE-valorB*valorF;
        //Operación denominador X
        double resultadoX2 = valorA*valorE-valorB*valorD;
        //Resultado de X
        double resultadoXtotal= resultadoX/resultadoX2;

        //Operación numerador Y
        double resultadoY = valorA*valorF-valorC*valorD;
        //Operación denominador Y
        double resultadoY2 = valorA*valorE-valorB*valorD;
        //Resultado de Y
        double resultadoYtotal = resultadoY/resultadoY2;
        
        //Respuesta al usuario
        System.out.println("El resultado de x es :" + resultadoXtotal + " , además el valor de y es : " + resultadoYtotal);

       
        //Cerramos ciclo
        ecuaciones.close();
    }
}
