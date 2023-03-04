public class Ejercicio12 {

    /*
    Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El
    porcentaje de retención en la fuente es del 12,5% del salario bruto. Se
    desea saber cuál es el salario bruto, la retención en la fuente y el salario
    neto del trabajador.
    */

    public static void main(String[] args) {

        double  retencionFuente, salarioBruto, salarioNeto;
        float valorHora, retencion;
        int horasTrabajadasSemana;

        valorHora = 5.000f;
        retencion = 12.5f; // %
        horasTrabajadasSemana = 48;
        salarioBruto = horasTrabajadasSemana * valorHora;
        retencionFuente = salarioBruto * (retencion / 100);
        salarioNeto =  salarioBruto - retencionFuente;

        System.out.println("El salario bruto a la semana del trbajador es: " + salarioBruto + "$");
        System.out.println("La retención en la fuente es: " + retencionFuente + "$");
        System.out.println("El salario neto a la semana del trabajador es: " + salarioNeto + "$");
    }
}
