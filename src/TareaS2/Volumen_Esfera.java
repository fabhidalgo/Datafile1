
package TareaS2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Volumen_Esfera {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        double radio,area,volumen;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.##");
        //Entrada de datos
        System.out.print("Ingrese el radio de la esfera:");
        radio=lectura.nextDouble();
        //Proceso de datos
        area=4*Math.PI*Math.pow(radio, 2);
        volumen=(4.0/3)*Math.PI*Math.pow(radio,3);
        //Salida de datos
        System.out.println("El área de la esfera es:"+formato.format(area));
        System.out.println("El volumen de la esfera es:"+formato.format(volumen));               
    }
}
