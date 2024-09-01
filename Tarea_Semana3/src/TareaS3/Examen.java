
package TareaS3;
import java.util.Scanner;
public class Examen {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        double nota;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese la nota del examen: ");
        nota = lectura.nextDouble();
        //Procesado de datos
        if (nota >= 11) {
            //Salida de datos
            System.out.println("¡Felicitaciones! Has aprobado el examen.");
            } else {
            System.out.println("Lo siento, has reprobado el examen.");
        }
    }
}
