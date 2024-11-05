import java.util.Date;
import java.util.Scanner;

//definimos la clase llamada "deber2"
public class deber2 {
    // Main es donde el programa empieza a ejecutarse, basicamente todo lo que está
    // dentro del método main es lo que hará el programa
    public static void main(String[] args) {
        System.out.println("Escribir un programa que lea un entero, lo multiplique por 2 y a continuación lo\r\n" + //
                "escriba de nuevo en la pantalla (la variable debe llevar las iniciales de su nombre).");

        // sacamos la fecha actual
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        // Creamos el objeto para leer lo que el usuario pone
        Scanner scaneado = new Scanner(System.in);
        // Hacemos la instrucción al usuario
        System.out.println("Escribe el número que desees : ");
        // Guardamos el número que ponga el usuario en la variable "ejercicioDeber"
        int ABejercicioDeber = scaneado.nextInt();

        // multiplicamos *2 y lo almacenamos en la variable "resultadoDeber"
        int ABresultadoDeber = ABejercicioDeber * 2;
        // imprimimos la variable "resultadoDeber" \n porque ahí está lo que nos pide
        System.out.println("El resultado es : " + ABresultadoDeber);
        // cerramos el scannnnn
        scaneado.close();
    }

}
