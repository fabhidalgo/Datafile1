package TareaS8;
import java.util.Scanner;
public class Impr_NPares_NImpares {
   public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el valor mínimo del rango: ");
        int VMinimo = lectura.nextInt();
        System.out.print("Ingresa el valor máximo del rango: ");
        int VMaximo = lectura.nextInt();
        
        System.out.println("Números pares en el rango:");
        for (int i = VMinimo; i <= VMaximo; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); 
        
        System.out.println("Números impares en el rango:");
        for (int i = VMinimo; i <= VMaximo; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    } 
}
