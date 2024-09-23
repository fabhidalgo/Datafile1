package TareaS6;
import java.util.Scanner;
public class Cajero_Automatico {
    // Metodo de la clase
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        double saldo= 0;
        int opcion=0;
        
        while (opcion != 4){
        
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double CantDeposito = lectura.nextDouble();
                    saldo += CantDeposito;
                    System.out.println("Nuevo saldo: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double CantRetiro = lectura.nextDouble();
                    if (CantRetiro <= saldo) {
                        saldo -= CantRetiro;
                        System.out.println("Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 3:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}




