package TareaS8;
import java.util.Scanner;
public class Impresión_Primos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número límite: ");
        int limite = lectura.nextInt();
        System.out.println("Números primos hasta " + limite + ":");
        for (int num = 2; num <= limite; num++) {
            boolean NPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    NPrimo = false;
                    break;
                }
            }
            if (NPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}
