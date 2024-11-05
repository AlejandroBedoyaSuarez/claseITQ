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

        // tendremos que hacer un acumulador
        //Hacemos String ya que queremos que solo cambie el decimal
        String numeroBase = "7."; 
        //hacemos el acumulador
        String acumulador = numeroBase; 
        //creamos ciclo for con la siguiente condición:
        // int i = valor inicial ; i debe ser menor o igual a 15 y debe sumar de uno en uno
        for (int i = 1; i <= 15; i++) {
            //gracias a esto, el acumulador puede ir sumando de uno en uno ya que i = 1
            acumulador += i; 
            /*se vería así: "7." + 1 = 7.1
            Luego sería "7.1" + 1 = 7.12 
            Luego sería "7.12" + 1 = 7.123
            */
            //Respuesta final
            System.out.println(acumulador); 
        }
    }
}
