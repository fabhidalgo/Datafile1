package TAREAS1;
import java.util.Scanner;
public class EJERCICIO_1 {
    //Metodo de la clase
    public static void main(String[] args) {
        //Declaración de variables
        double PrecioU,Subtotal,IGV,Total;
        int cantidad;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String NombreCliente = lectura.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        String NombreProducto = lectura.nextLine();
        
        System.out.print("Ingrese el precio unitario del producto: ");
        PrecioU = lectura.nextDouble();
        
        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = lectura.nextInt();
        
        //Procesado de datos
        Subtotal = PrecioU * cantidad;
        IGV = Subtotal * 0.18;
        Total = Subtotal + IGV;
        
        //Salida de datos
        System.out.println("Resumen de la venta:");
        System.out.println("Cliente: " + NombreCliente);
        System.out.println("Producto: " + NombreProducto);
        System.out.println("Precio unitario: S/ " + PrecioU);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: S/ " + Subtotal);
        System.out.println("IGV (18%): S/ " + IGV);
        System.out.println("Sr(a) " + NombreCliente + ", el total a pagar es de: S/ " + Total);
    }
}
