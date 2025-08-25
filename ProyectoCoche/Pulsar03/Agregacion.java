package Pulsar03;
public class Agregacion {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Gasolina", 180);
        Automovil auto1 = new Automovil("Mazda", "CX-5", motor1);

        System.out.println(auto1);
    }
}
