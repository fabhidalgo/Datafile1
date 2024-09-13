package TAREAS4;
import java.util.Scanner;
public class EJERCICIO_2 {
     //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa un número entero entre 1 y 10: ");
        numero = lectura.nextInt();
        //Procesado de datos
        String nromano;
        switch (numero) {
            case 1:
                nromano = "I";
                break;
            case 2:
                nromano = "II";
                break;
            case 3:
                nromano = "III";
                break;
            case 4:
                nromano = "IV";
                break;
            case 5:
                nromano = "V";
                break;
            case 6:
                nromano = "VI";
                break;
            case 7:
                nromano = "VII";
                break;
            case 8:
                nromano = "VIII";
                break;
            case 9:
                nromano = "IX";
                break;
            case 10:
                nromano = "X";
                break;
            default:
                nromano = "se encuentra fuera de rango. Por favor ingresa un número entre 1 y 10.";
                break;
        }
        //Salida de datos
        System.out.println("El número ingresado: " + nromano);
    }
}
