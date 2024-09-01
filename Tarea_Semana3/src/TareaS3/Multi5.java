
package TareaS3;
import java.util.Scanner;
public class Multi5 {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese un número: ");
        numero=lectura.nextInt();
        //Procesado de datos
        if (numero % 5 == 0) {
            //Salida de datos
            System.out.println("El número es múltiplo de 5.");
        }
    }
}
    
    

