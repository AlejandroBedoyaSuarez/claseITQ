import java.util.Date;
import java.util.Scanner;

public class deber4 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);

        System.out.println("Realizado por Alejandro Bedoya");

        // Instrucción
        System.out.println(
                " Escriba un programa para calcular la longitud de la circunferencia y el área del círculo\r\n" + //
                        "para un radio introducido por el teclado.");

        // Hacemos el scanner para el usuario
        Scanner scansote = new Scanner(System.in);
        // colocamos una constante que será "pi" con su valor correspondiente
        final double pi = 3.14159;
        // Instrucción
        System.out.println("Escribe los datos del diámetro en centimetros : ");
        // el usuario nos da el diámetro del círulo
        double datosDiametro = scansote.nextDouble();

        // hacemos la operación de longitud que es pi * diámetro
        double datosLongitud = pi * datosDiametro;
        // luego hacemos la operación que es para sacar el radio
        double datosRadio = datosDiametro / 2;
        // luego hacemos la operación que es para sacar el area pi * radio al cuadrado
        double datosArea = pi * Math.pow(datosRadio, 2);

        // Resultado
        System.out.println("La Longitud del círculo es : " + datosLongitud + " y el área del círculo es : " + datosArea);
        scansote.close();
    }
}
