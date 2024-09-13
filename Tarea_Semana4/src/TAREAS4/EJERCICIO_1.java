package TAREAS4;
import java.util.Scanner;
public class EJERCICIO_1 {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa un número entero entre 1 y 5: ");
        numero = lectura.nextInt();
        //Procesado de datos
        String palabra;
        switch (numero) {
            case 1:
                palabra = "Uno";
                break;
            case 2:
                palabra = "Dos";
                break;
            case 3:
                palabra = "Tres";
                break;
            case 4:
                palabra = "Cuatro";
                break;
            case 5:
                palabra = "Cinco";
                break;
            default:
                palabra = "se encuentra fuera de rango. Por favor ingresa un número entre 1 y 5.";
                break;
        }
        //Salida de datos
        System.out.println("El número ingresado: " + palabra);
    }
}
