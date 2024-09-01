package TareaS3;
import java.util.Scanner;
public class Notas_Examen {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        int nota;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese su nota (1-10): ");
        nota = lectura.nextInt();
        //Procesado de datos
        String respuesta;
        
        switch (nota) {
            case 10: // Para 100
            case 9:
                respuesta = "Excelente";
                break;
            case 8:
                respuesta = "Muy buena";
                break;
            case 7:
                respuesta = "Buena";
                break;
            case 6:
                respuesta = "Aceptable";
                break;
            default:
                respuesta = "Inaceptable";
                break;
        }
        //Salida de datos
        System.out.println("Tu calificación es: " + respuesta);
    }        
}




    

       

        
