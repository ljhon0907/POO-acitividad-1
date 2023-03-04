import java.util.Scanner;

public class Ejercicio12Alternativo {

    /*
    Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El
    porcentaje de retención en la fuente es del 12,5% del salario bruto. Se
    desea saber cuál es el salario bruto, la retención en la fuente y el salario
    neto del trabajador.

    En este caso el valor de la hora y las horas trabajadas por semana
    seran ingresadas por el usuario.
    */

    public static void main(String[] args) {

        double  valorHora, retencion, retencionFuente, salarioBruto, salarioNeto;

        int horasTrabajadasSemana;

        Scanner entrada = new Scanner(System.in);
        retencion = 12.5; // %


        System.out.println("Valor de la hora: ");
        valorHora = entrada.nextDouble();

        System.out.println("Horas trabajadas esta semana: ");
        horasTrabajadasSemana = entrada.nextInt();

        salarioBruto = horasTrabajadasSemana * valorHora;
        retencionFuente = salarioBruto * (retencion / 100);
        salarioNeto =  salarioBruto - retencionFuente;

        System.out.println("El salario bruto a la semana del trbajador es: " + salarioBruto + "$");
        System.out.println("La retención en la fuente es: " + retencionFuente + "$");
        System.out.println("El salario neto a la semana del trabajador es: " + salarioNeto + "$");
    }
}
