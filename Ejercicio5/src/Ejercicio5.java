public class Ejercicio5 {

    /*
    Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
    INICIO
    SUMA = 0
    X = 20
    SUMA = SUMA + X
    Y = 40
    X = X + Y ** 2
    SUMA = SUMA + X / Y
    ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
    FIN_INICIO
     */

    public static void main(String[] args) {
        double SUMA, X, Y;
        SUMA = 0;
        X = 20;
        SUMA += X;
        Y = 40;
        X += Math.pow(Y, 2);
        SUMA += X/Y;
        System.out.println("EL VALOR DE LA SUMA ES:" + SUMA);
    }
    /*
     SUMA       X       Y
       0        20      40
       20       1620
       60.5
     */
}
