package TareaS9;
import java.util.Scanner;
public class Registro_Compras {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();
        double[] Compras = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            Compras[i] = lectura.nextDouble();
        }
        double TotalCompras = 0;
        for (double Compra : Compras) {
            TotalCompras += Compra;
        }
        double PromedioCompras = TotalCompras / n;
        double CompraMayor = Compras[0];
        double CompraMenor = Compras[0];
        for (int i = 1; i < n; i++) {
            if (Compras[i] > CompraMayor) {
                CompraMayor = Compras[i];
            }
            if (Compras[i] < CompraMenor) {
                CompraMenor = Compras[i];
            }
        }
        System.out.println("El total de las compras es: " + TotalCompras);
        System.out.println("El promedio de las compras es: " + PromedioCompras);
        System.out.println("La compra mayor es: " + CompraMayor);
        System.out.println("La compra menor es: " + CompraMenor);
    }
}
