package TareaS12;
import java.util.Scanner;
public class EJERCICIO_3 {

    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    public EJERCICIO_3(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    public double CalcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }

    public double CalcularPromedio() {
        return CalcularTotal() / 4;
    }

    public double ObtenerCompraMayor() {
        return Math.max(Math.max(compra1, compra2), Math.max(compra3, compra4));
    }

    public double ObtenerCompraMenor() {
        return Math.min(Math.min(compra1, compra2), Math.min(compra3, compra4));
    }

    public void MostrarResultados() {
        System.out.println("Total de compras: " + CalcularTotal());
        System.out.println("Promedio de compras: " + CalcularPromedio());
        System.out.println("Compra mayor: " + ObtenerCompraMayor());
        System.out.println("Compra menor: " + ObtenerCompraMenor());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra #1: ");
        double compra1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la compra #2: ");
        double compra2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la compra #3: ");
        double compra3 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la compra #4: ");
        double compra4 = scanner.nextDouble();

        EJERCICIO_3 compras = new EJERCICIO_3(compra1, compra2, compra3, compra4);

        compras.MostrarResultados();

    } 
}
