package TareaS9;
import java.util.Scanner;
public class Peso_N {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();
        double[] pesos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
        }
        double SumaPesos = 0;
        for (double peso : pesos) {
            SumaPesos += peso;
        }
        double promedio = SumaPesos / n;
        System.out.println("El peso promedio de las personas es: " + promedio);
    }
}
