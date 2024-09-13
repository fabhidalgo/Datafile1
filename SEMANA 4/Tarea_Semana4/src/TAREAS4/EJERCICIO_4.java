package TAREAS4;
import java.util.Scanner;
public class EJERCICIO_4 {
     //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa un número entero (1, 2, 3, 4, 5, 6, 12): ");
        numero = lectura.nextInt();
        //Procesado de datos
        String periodo;
        switch (numero) {
            case 1:
                periodo = "Anual";
                break;
            case 2:
                periodo = "Semestral";
                break;
            case 3:
                periodo = "Cuatrimestral";
                break;
            case 4:
                periodo = "Trimestral";
                break;
            case 6:
                periodo = "Bimestral";
                break;
            case 12:
                periodo = "Mensual";
                break;
            default:
                periodo = "no se puede calcular debido a que no ha ingresado uno de los caracteres permitidos: 1, 2, 3, 4, 6, 12.";
                break;
        }
        //Salida de datos
        System.out.println("El periodo anual correspondiente: " + periodo);
    }
}
