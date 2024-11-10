import java.util.Scanner;
import java.util.Date;

public class deber9 {
    public static void main(String[] args) {
        Date horadelDeber = new Date();
        System.out.println(horadelDeber);

        System.out.println("Realizado por Alejandro Bedoya");

        System.out.println(
                "Instrucción : Escribir un programa que determine si un año es bisiesto. Un año es bisiesto si es\r\n" + //
                        "múltiplo de 4 (por ejemplo, 1984). Sin embargo, los años múltiplos de 100 sólo son\r\n" + //
                        "bisiestos cuando a la vez son múltiples de 400 (por ejemplo, 1800 no es bisiesto,\r\n" + //
                        "mientras que 2000 si lo será).");

        Scanner añitoBisiesto = new Scanner(System.in);
        System.out.println("Este Programa te permitirá calcular si es año bisiesto.");
        System.out.println("Ingresa el año que gustes: ");
        int añoUsuario = añitoBisiesto.nextInt();

        if (esBisiesto(añoUsuario)) {
            System.out.println("El año " + añoUsuario + " es bisiesto.");
        } else {
            System.out.println("El año " + añoUsuario + " no es bisiesto.");
        }

        añitoBisiesto.close();
    }

    public static boolean esBisiesto(int añoUsuario) {
        // Un año es bisiesto si es múltiplo de 4, pero no de 100, a menos que sea
        // múltiplo de 400
        if ((añoUsuario % 4 == 0 && añoUsuario % 100 != 0) || (añoUsuario % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
