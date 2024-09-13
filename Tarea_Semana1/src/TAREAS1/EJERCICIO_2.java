package TAREAS1;
import java.util.Scanner;
public class EJERCICIO_2 {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        double TotalSueldos,Promedio;
        Scanner lectura = new Scanner(System.in);
        double[] Sueldos = new double[5];
        TotalSueldos=0;
        
        //Entrada de datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            Sueldos[i] = lectura.nextDouble();
            TotalSueldos += Sueldos[i];
        }
        
        //Procesado de datos
        Promedio = TotalSueldos / 5;
        
        //Salida de datos
        System.out.println("El total de sueldos es de: S/ " + TotalSueldos);
        System.out.println("El promedio de sueldos es de: S/ " + Promedio);
    }
}
