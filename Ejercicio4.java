package Ej_1;

public class Ej_propuesto4 {
    public static double menor(double a, double b, double c) {
        double menor = a; 
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        
        return menor;
    }
    public static void main(String[] args) {
        double n1 = 4.5, n2 = 2.3, n3 = 7.8;  
        double resultado = menor(n1, n2, n3);  
        System.out.println("El menor número es: " + resultado);
    }
}
