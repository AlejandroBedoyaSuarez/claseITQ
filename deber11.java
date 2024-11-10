import java.util.Scanner;
import java.util.Date;

public class deber11 {
    public static void main(String[] args) {
        // Muestra la fecha actual
        Date fechitaChequeta = new Date();
        System.out.println(fechitaChequeta);

        // Muestra el nombre del autor
        System.out.println("Realizado por Alejandro Bedoya");

        // Muestra la instrucción del programa
        System.out.println("Instrucción: Escribir un programa que permita pedir 10 números ingresados por teclado y\n" +
                "mostrar al final si se ha introducido alguno negativo.");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner numeritos = new Scanner(System.in);
        int cantidadNumeros = 10; // Cantidad de números que el usuario deberá ingresar
        boolean hayNegativo = false; // Bandera para verificar si algún número es negativo

        System.out.println(
                "Este programa te permite ingresar 10 números y al final te indica si alguno de ellos es negativo.");

        // Bucle para solicitar 10 números al usuario
        // cantidadNumeros ------ está definido previamente con el valor 10, que representa la cantidad de números que se solicitarán.
        // La condición i <= cantidadNumeros verifica que el bucle siga ejecutándose mientras i sea menor o igual a 10.
        // Cuando i llegue a 11, esta condición será falsa y el bucle se detendrá.
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = numeritos.nextDouble();

            // Verificar si el número ingresado es negativo
            if (numero < 0) {
                hayNegativo = true; // Actualiza la bandera si encuentra un número negativo
            }
        }

        // Comprobar si se encontró algún número negativo y mostrar el mensaje
        // correspondiente
        if (hayNegativo) {
            System.out.println("Se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se han introducido números negativos.");
        }

        
        numeritos.close();
    }
}