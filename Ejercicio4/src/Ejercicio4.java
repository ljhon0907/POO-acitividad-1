import java.util.Scanner;

public class Ejercicio4 {

    /*
    A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
    edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
    la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
     */

    public static void main(String[] args) {

        int edadJuan, edadAna, edadAlberto, edadMama;
        Scanner entrada = new Scanner(System.in);

        System.out.println("La edad de juan es: ");
        edadJuan = entrada.nextInt();

        edadAlberto = 2 * (edadJuan / 3);
        edadAna = 4 * (edadJuan / 3);
        edadMama = edadJuan + edadAlberto + edadAna;

        System.out.println("La edad de Juan es: " + edadJuan);
        System.out.println("La edad de Alberto es: " + edadAlberto);
        System.out.println("La edad de Ana es: " + edadAna);
        System.out.println("La edad de la mamá es: " + edadMama);
    }
}