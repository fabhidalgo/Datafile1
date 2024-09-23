package TareaS6;
import java.util.Scanner;
import java.lang.Math;
public class Calculadora_Geometrica {
    //Metodo de la clase
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            // Entrada de datos
            System.out.println("*Calculadora Geométrica*");
            System.out.println("1. Cálculo de área y perímetro de un círculo");
            System.out.println("2. Cálculo de área y perímetro de un cuadrado");
            System.out.println("3. Cálculo de área y perímetro de un triángulo equilátero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lectura.nextInt();
            // Procesado de datos
            switch (opcion) {
                case 1:
                    // Cálculo para el circulo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = lectura.nextDouble();
                    double ACirculo = Math.PI * radio * radio;
                    double PCirculo = 2 * Math.PI * radio;
                    
                    System.out.println("Área del círculo es: " + ACirculo);
                    System.out.println("Perímetro del círculo es: " + PCirculo);
                    break;

                case 2:
                    // Cálculo para el cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double LCuadrado = lectura.nextDouble();
                    double ACuadrado = Math.pow(LCuadrado,2);
                    double PCuadrado = 4 * LCuadrado;
                    
                    System.out.println("Área del cuadrado es: " + ACuadrado);
                    System.out.println("Perímetro del cuadrado es: " + PCuadrado);
                    break;

                case 3:
                    // Cálculo para triángulo equilátero
                    System.out.print("Ingrese el lado del triángulo equilátero: ");
                    double LTriangulo = lectura.nextDouble();
                    double ATriangulo = (Math.sqrt(3) / 4) * Math.pow(LTriangulo,2);
                    double PTriangulo = 3 * LTriangulo;
                    
                    System.out.println("Área del triángulo equilátero es: " + ATriangulo);
                    System.out.println("Perímetro del triángulo equilátero es: " + PTriangulo);
                    break;

                case 4:
                    // Opción salir del programa
                    System.out.println("Saliendo de la calculadora geométrica...");
                    break;

                default:
                    // Opción inválida
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
