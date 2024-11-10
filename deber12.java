import java.util.Date;
import java.util.Scanner;

// Clase base Personaje
class Personaje {
    // Atributos
    protected String nombre;
    protected int poderPelea;
    protected String raza;

    // Constructor
    public Personaje(String nombre, int poderPelea, String raza) {
        this.nombre = nombre;
        this.poderPelea = poderPelea;
        this.raza = raza;
    }

    // Método que no retorna valor: muestra información del personaje
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder de Pelea: " + poderPelea);
        System.out.println("Raza: " + raza);
    }

    // Método que retorna un valor: obtiene el poder de pelea
    public int obtenerPoderPelea() {
        return poderPelea;
    }
}

// Clase derivada Saiyan que hereda de Personaje
class Saiyan extends Personaje {
    private boolean tieneTransformacion;

    // Constructor
    public Saiyan(String nombre, int poderPelea, boolean tieneTransformacion) {
        super(nombre, poderPelea, "Saiyan");
        this.tieneTransformacion = tieneTransformacion;
    }

    // Método que no retorna valor: transformar en Super Saiyan
    public void transformar() {
        if (tieneTransformacion) {
            System.out.println(nombre + " se ha transformado en Super Saiyan.");
            poderPelea += 5000; // Aumenta el poder al transformarse
        } else {
            System.out.println(nombre + " no puede transformarse.");
        }
    }
}

public class deber12 {
    public static void main(String[] args) {
        // Obtener la fecha actual
        Date fechaMomento = new Date();
        System.out.println(fechaMomento);

        // Información del desarrollador y enunciado
        System.out.println("Realizado por Alejandro Bedoya");
        System.out.println("Instrucción : Implemente un ejemplo de clase (cada estudiante debe tener un ejemplo diferente)\r\n" +
                           "con al menos 3 atributos y 2 métodos. Uno de los métodos debe retornar un valor y otro\r\n" +
                           "no debe hacerlo. Implemente herencia e imprima en consola los resultados.");

        // Crear un objeto Saiyan
        Saiyan goku = new Saiyan("Goku", 9000, true);

        // Mostrar información del personaje
        System.out.println("\n--- Información del Personaje ---");
        goku.mostrarInfo();

        // Transformar en Super Saiyan
        System.out.println("\n--- Transformación ---");
        goku.transformar();

        // Mostrar el nuevo poder de pelea
        System.out.println("\n--- Poder de Pelea Actualizado ---");
        System.out.println("Poder de Pelea de " + goku.nombre + " después de la transformación: " + goku.obtenerPoderPelea());
    }
}
