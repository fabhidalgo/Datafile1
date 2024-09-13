package TAREAS4;
import java.util.Scanner;
public class EJERCICIO_3 {
     //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa un número entero entre 1 y 6: ");
        numero = lectura.nextInt();
        //Procesado de datos
        String pingles;
        switch (numero) {
            case 1:
                pingles = "One";
                break;
            case 2:
                pingles = "Two";
                break;
            case 3:
                pingles = "Three";
                break;
            case 4:
                pingles = "Four";
                break;
            case 5:
                pingles = "Five";
                break;
            case 6:
                pingles = "Six";
                break;
            default:
                pingles = "se encuentra fuera de rango. Por favor ingresa un número entre 1 y 6.";
                break;
        }
        //Salida de datos
        System.out.println("El número ingresado: " + pingles);
    }
}
