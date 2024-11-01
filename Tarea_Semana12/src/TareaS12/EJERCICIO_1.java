package TareaS12;
import java.util.Scanner;
public class EJERCICIO_1 {
    
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    public EJERCICIO_1(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }

    public double CalcularTotal() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }

    public double CalcularPromedio() {
        return CalcularTotal() / 4;
    }

    public double ObtenerSueldoMayor() {
        return Math.max(Math.max(sueldo1, sueldo2), Math.max(sueldo3, sueldo4));
    }

    public double ObtenerSueldoMenor() {
        return Math.min(Math.min(sueldo1, sueldo2), Math.min(sueldo3, sueldo4));
    }

    public void MostrarResultados() {
        System.out.println("Total de sueldos: " + CalcularTotal());
        System.out.println("Promedio de sueldos: " + CalcularPromedio());
        System.out.println("Sueldo mayor: " + ObtenerSueldoMayor());
        System.out.println("Sueldo menor: " + ObtenerSueldoMenor());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite el sueldo #1: ");
        double sueldo1 = scanner.nextDouble();
        
        System.out.print("Digite el sueldo #2: ");
        double sueldo2 = scanner.nextDouble();
        
        System.out.print("Digite el sueldo #3: ");
        double sueldo3 = scanner.nextDouble();
        
        System.out.print("Digite el sueldo #4: ");
        double sueldo4 = scanner.nextDouble();
        
        EJERCICIO_1 empleado = new EJERCICIO_1(sueldo1, sueldo2, sueldo3, sueldo4);
        empleado.MostrarResultados();
        
        scanner.close();
    }
}
