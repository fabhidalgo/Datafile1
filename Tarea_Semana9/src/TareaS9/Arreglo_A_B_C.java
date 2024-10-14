package TareaS9;
import java.util.Scanner;
public class Arreglo_A_B_C {
   public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo a:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = lectura.nextInt();
        }
        System.out.println("Ingrese los elementos del arreglo b:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = lectura.nextInt();
        }
        int IndexC = 0;
        for (int i = 0; i < A.length; i++) {
            C[IndexC++] = A[i];
            C[IndexC++] = B[i];
        }
        System.out.println("Los elementos del arreglo C son:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    } 
}
