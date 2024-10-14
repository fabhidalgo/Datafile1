package TareaS9;
import java.util.Scanner;
public class Ingreso_Promedio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();
        double[] Ingresos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            Ingresos[i] = lectura.nextDouble();
        }
        double SumaIngresos = 0;
        for (double Ingreso : Ingresos) {
            SumaIngresos += Ingreso;
        }
        double Promedio = SumaIngresos / n;
        double IngresoMayor = Ingresos[0];
        for (int i = 1; i < n; i++) {
            if (Ingresos[i] > IngresoMayor) {
                IngresoMayor = Ingresos[i];
            }
        }
        System.out.println("El ingreso promedio es: " + Promedio);
        System.out.println("El ingreso mayor es: " + IngresoMayor);
    }
}
