
package TareaS2;
import java.util.Scanner;
import java.lang.Math;
public class Num_Aleatorio {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int min,max,numeroAleatorio;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el límite inferior:");
        min=lectura.nextInt();
        System.out.print("Ingrese el límite superior:");
        max=lectura.nextInt();
        //Proceso de datos
        numeroAleatorio = (int) (Math.random() * (max - min)) + min;
        //Salida de datos
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
    
}
