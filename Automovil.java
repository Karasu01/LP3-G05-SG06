package Pulsar03;
public class Automovil {
    private String marca;
    private String modelo;
    private Motor motor; 

    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String toString() {
        return "Automovil: " + marca + " " + modelo + " con " + motor.toString();
    }
}
