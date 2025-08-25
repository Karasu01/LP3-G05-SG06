package Coche01;
public class Main {
    public static void main(String[] args) {
        Coche01 miCoche = new Coche01("Pagani", "Huayra", 2011, 3000000);

        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Año: " + miCoche.getAnioFabricacion());
        System.out.println("Precio: " + miCoche.getPrecio());

        miCoche.aplicarDescuento(10); // 10%
    }
}
