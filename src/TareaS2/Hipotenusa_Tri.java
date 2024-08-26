
package TareaS2;
import java.util.Scanner;
import java.lang.Math;
public class Hipotenusa_Tri {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        double catetoA,catetoB,hipotenusa;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el valor del cateto A: ");
        catetoA = lectura.nextDouble();
        System.out.print("Ingrese el valor del cateto B: ");
        catetoB = lectura.nextDouble();
        //Proceso de datos
        hipotenusa=Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
        //Salida de datos
        System.out.println("La hipotenusa es:"+hipotenusa);
    }
}
