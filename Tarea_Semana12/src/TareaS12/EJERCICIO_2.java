package TareaS12;
import java.util.Scanner;
public class EJERCICIO_2 {
    
    private double IngresoMensual;
    private double OtrosIngresos;
    private double GastosMensuales;

    public EJERCICIO_2(double IngresoMensual, double OtrosIngresos, double GastosMensuales) {
        this.IngresoMensual = IngresoMensual;
        this.OtrosIngresos = OtrosIngresos;
        this.GastosMensuales = GastosMensuales;
    }

    public double CalcularAhorroMensual() {
        return (IngresoMensual + OtrosIngresos) - GastosMensuales;
    }

    public double CalcularAhorroSemestral() {
        return CalcularAhorroMensual() * 6;
    }

    public double CalcularAhorroAnual() {
        return CalcularAhorroMensual() * 12;
    }

    public void MostrarResultados() {
        System.out.println("Ahorro mensual: " + CalcularAhorroMensual());
        System.out.println("Ahorro semestral proyectado: " + CalcularAhorroSemestral());
        System.out.println("Ahorro anual proyectado: " + CalcularAhorroAnual());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ingreso mensual: ");
        double IngresoMensual = scanner.nextDouble();

        System.out.print("Ingrese otros ingresos: ");
        double OtrosIngresos = scanner.nextDouble();

        System.out.print("Ingrese los gastos mensuales: ");
        double GastosMensuales = scanner.nextDouble();

        EJERCICIO_2 empleado = new EJERCICIO_2(IngresoMensual, OtrosIngresos, GastosMensuales);

        empleado.MostrarResultados();

    }
}
