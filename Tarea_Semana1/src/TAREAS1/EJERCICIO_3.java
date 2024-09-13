package TAREAS1;
import java.util.Scanner;
public class EJERCICIO_3 {
    // Metodo de la clase
    public static void main(String[] args) {
        // Declaración de variables
        double IngresoMensual,GastoMensual,AhorroMensual,AhorroBimestral,AhorroSemestral,AhorroAnual;
        Scanner lectura = new Scanner(System.in);

        // Datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String Nombre = lectura.nextLine();

        System.out.print("Ingrese el cargo del empleado: ");
        String Cargo = lectura.nextLine();

        System.out.print("Ingrese el ingreso mensual del empleado: ");
        IngresoMensual = lectura.nextDouble();

        System.out.print("Ingrese el gasto mensual del empleado: ");
        GastoMensual = lectura.nextDouble();

        // Cálculo del ahorro mensual
        AhorroMensual = IngresoMensual - GastoMensual;

        // Cálculo de ahorros a diferentes plazos
        AhorroBimestral = AhorroMensual * 2;
        AhorroSemestral = AhorroMensual * 6;
        AhorroAnual = AhorroMensual * 12;

        // Mostrar resultados
        System.out.println("Resumen de ahorros para " + Nombre + " (" + Cargo + ")");
        System.out.println("Ahorro mensual: S/" + AhorroMensual);
        System.out.println("Ahorro bimestral: S/" + AhorroBimestral);
        System.out.println("Ahorro semestral: S/" + AhorroSemestral);
        System.out.println("Ahorro anual: S/" + AhorroAnual);
    }
}