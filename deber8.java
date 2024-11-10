import java.util.Scanner;
import java.util.Date;

public class deber8 {
    public static void main(String[] args) {
        Date Fechota = new Date();
        System.out.println(Fechota);

        System.out.println("Realizado por Alejandro Bedoya");

        System.out.println(
                "Instrucción : Escribir un programa para convertir una medida dada en pies a sus equivalentes en :\r\n"
                        + //
                        "a) yardas; b) pulgadas; c) centímetros, y d) metros (1 pie = 12 pulgadas, 1 yarda = 3 pies,\r\n"
                        + //
                        "1 pulgada = 2,54 cm, 1 m = 100 cm). Leer el número de pies e imprimir el número de\r\n" + //
                        "yardas, pies, pulgadas, centímetros y metros, implementar la solución mediante\r\n" + //
                        "métodos con retorno.");

        Scanner scaneao = new Scanner(System.in);
        System.out.println("Sistema de Conversión de Pies a : Yardas, Pulgadas, Centímetros y Metros");
        System.out.println("Escriba su valor en Pies: ");
        double calcular = scaneao.nextDouble();

        double yarda = calcularYarda(calcular);
        double pulgada = calcularPulgada(calcular);
        double metro = calcularMetro(calcular);
        double centimetros = calcularCentimetros(calcular);

        System.out.println("El valor de sus unidades corresponde en lo siguiente : En yardas es : " + yarda
                + ", en pies es: " + calcular + ", en pulgadas es : \r\n"
                + pulgada + ", en metros es : " + metro + " y en centímetros es : " + centimetros);

        scaneao.close();
    }

    public static double calcularYarda(double calcular) {
        double finalCalculo = 3 * calcular;
        return finalCalculo;
    }

    public static double calcularPulgada(double calcular) {
        double finalCalculo = 12 * calcular;
        return finalCalculo;
    }

    public static double calcularMetro(double calcular) {
        double finalCalculo = 0.3048 * calcular;
        return finalCalculo;
    }

    public static double calcularCentimetros(double calcular) {
        double finalCalculo = 30.48 * calcular;
        return finalCalculo;
    }

}
