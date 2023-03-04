import java.util.Scanner;

public class Ejercicio14 {

    /*
    Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.
     */

    public static void main(String[] args) {

        double numero, cuadrado, cubo;
        Scanner entra = new Scanner(System.in);

        System.out.println("Ingrese número: ");
        numero = entra.nextDouble();

        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);

        System.out.println("El cuadrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);
    }
}
