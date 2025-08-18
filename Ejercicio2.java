package Ej_1;
import java.util.Scanner;
public class Ej_propuesto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.print("Ingrese el número 1: ");
        numeros[0] = sc.nextInt();
        for (int i = 1; i < numeros.length; i++) {
            int num;
            do {
                System.out.print("Ingrese el número " + (i + 1) + " (mayor que " + numeros[i - 1] + "): ");
                num = sc.nextInt();
            } while (num <= numeros[i - 1]); 
            
            numeros[i] = num;
        }
        System.out.println("\nNúmeros ingresados en el arreglo:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
