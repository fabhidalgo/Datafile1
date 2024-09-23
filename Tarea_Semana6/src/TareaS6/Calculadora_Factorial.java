package TareaS6;
import java.util.Scanner;
public class Calculadora_Factorial {
    // Metodo de la clase
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        // Ingresp de datos
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = lectura.nextInt();
        int factorial = 1, i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
