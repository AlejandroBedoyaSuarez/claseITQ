import java.util.Date;
import java.util.Scanner;

public class deber5 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);
        // Instrucción
        System.out.println(" Escribir un programa que visualice valores\r\n" + //
                "tales como:\r\n" + //
                "7.1\r\n" + //
                "7.12\r\n" + //
                "7.123\r\n" + //
                "7.1234\r\n" + //
                "7.12345\r\n" + //
                "7.123456");

        Scanner decision = new Scanner(System.in);
        System.out.println("Escriba 'si' para usar un número propio o 'no' para usar el número default:");
        String datoUsuario = decision.nextLine();

        if (datoUsuario.equals("no")) {
            // Usamos el número base "7." y acumulamos dígitos del 1 al 15
            String numeroBase = "7.";
            String acumulador = numeroBase;

            // Bucle para agregar decimales del 1 al 15
            for (int i = 1; i <= 15; i++) {
                acumulador += i; // Agrega el siguiente dígito
                System.out.println(acumulador);
            }
        } else if (datoUsuario.equals("si")) {
            System.out.println("Escriba el número:");
            String numeroUsuario = decision.nextLine();
            String acumulador = numeroUsuario + ".";

            // Bucle para agregar decimales del 1 al 15 al número personalizado
            for (int i = 1; i <= 15; i++) {
                acumulador += i;
                System.out.println(acumulador);
            }
        } else {
            System.out.println("Opción no válida. Por favor, ingrese 'si' o 'no'.");
        }

        decision.close(); // Cerramos el Scanner 
    }

}
