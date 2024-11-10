import java.util.Date;
import java.util.Scanner;

public class deber10 {
    public static void main(String[] args) {
        // Crear una instancia de Date para mostrar la fecha actual
        Date fechitaPumba = new Date();
        System.out.println(fechitaPumba);

        // Mostrar autor del programa
        System.out.println("Realizado por Alejandro Bedoya");

        // Mostrar la instrucción del programa
        System.out.println(
                "Instrucción: Escribir un programa que permita leer un número por teclado y comprobar que este\n" +
                        "número es mayor o igual que cero, si no lo es lo volverá a pedir, después muestra ese\n" +
                        "número por consola.");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner numeroSuperior = new Scanner(System.in);
        double comprobacionUsuario;

        // Explicar la funcionalidad del programa al usuario
        System.out.println("Este programa te permite comprobar si tu número es mayor o igual a cero");

        // Bucle do-while para verificar que el número es mayor o igual a cero
        do {
            // Pedir al usuario que ingrese el número
            System.out.print("Ingresa el número que deseas comprobar: ");
            comprobacionUsuario = numeroSuperior.nextDouble();

            // Verificar si el número es menor a cero y mostrar un mensaje si es necesario
            if (comprobacionUsuario < 0) {
                System.out.println("Este número no es mayor o igual a cero. Inténtalo de nuevo.");
            }
        } while (comprobacionUsuario < 0); // Repetir el bucle mientras el número sea menor a cero

        System.out.println("Este número es mayor o igual a cero: " + comprobacionUsuario);

        numeroSuperior.close();
    }
}