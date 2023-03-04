import java.util.Scanner;

public class Ejercicio17 {

    /*
    Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
    de la circunferencia
     */

    public static void main(String[] args) {
        double radio, area, longitud;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        System.out.println("El area del círculo es: " + area + " U^2");
        System.out.println("La longitud de la circunferencia es: " + longitud + " U");
    }
}
