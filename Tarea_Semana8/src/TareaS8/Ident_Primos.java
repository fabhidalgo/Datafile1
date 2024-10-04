package TareaS8;
import java.util.Scanner;
public class Ident_Primos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa un número para verificar si es primo: ");
        int Num = lectura.nextInt();
        boolean NPrimo = true;
        if (Num <= 1) {
            NPrimo = false;
        } else {
            for (int i = 2; i <= Num / 2; i++) {
                if (Num % i == 0) {
                    NPrimo = false;
                    break;
                }
            }
        }
        if (NPrimo) {
            System.out.println(Num + " es un número primo.");
        } else {
            System.out.println(Num + " no es un número primo.");
        }
    }  
}
