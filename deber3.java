import java.util.Date;
import java.util.Scanner;

public class deber3 {
    public static void main(String[] args) {

        // Instrucción
        System.out.println("Escribir un programa que convierte un número dado de segundos en el equivalente\r\n" + //
                "de minutos y segundos.");

        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);

        // Creamos el objeto
        Scanner scansito = new Scanner(System.in);
        // Damos la instrucción al usuario
        System.out.println("Escribe los segundos que deseas convertir en minutos y segundos : ");
        // se guarda en la variable "datosSegundos" lo que el usuario nos pone en
        // segundos
        int datoSegundos = scansito.nextInt();

        // creamos esta variable para poder sacar únicamente los minutos
        int datoMinutos = datoSegundos / 60;
        // creamos esta variable para poder sacar los segundos restantes del minuto.
        // Ejemplo: de 150s, el tiempo restante es de 2 minutos con 30 segundos. La
        // parte que saca es 30s
        int datoRestante = datoSegundos % 60;
        // resultado
        System.out.println("La conversión del tiempo es : " + datoMinutos + " minutos y " + datoRestante + " segundos.");
        // cerramos el scannnnnnnnn
        scansito.close();

    }
}
