package TareaS9;
import java.util.Scanner;
public class Lista_Nombres {
   public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] Nombres = new String[5];
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < Nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            Nombres[i] = lectura.nextLine();
        }
        System.out.print("Ingrese el nombre a buscar: ");
        String BuscarNombre = lectura.nextLine();
        boolean Encontrado = false;
        int Posicion = -1;
        for (int i = 0; i < Nombres.length; i++) {
            if (Nombres[i].equalsIgnoreCase(BuscarNombre)) {
                Encontrado = true;
                Posicion = i;
                break;
            }
        }
        if (Encontrado) {
            System.out.println("El nombre " + BuscarNombre + " se encontró en la posición " + (Posicion + 1));
        } else {
            System.out.println("El nombre " + BuscarNombre + " no se encontró en el arreglo.");
        }
    } 
}
