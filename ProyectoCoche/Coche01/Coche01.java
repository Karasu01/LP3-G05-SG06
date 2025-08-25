package Coche01;
public class Coche01 {
    // Atributos
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    public Coche01() {
        this.marca = "Desconocida";
        this.modelo = "Sin modelo";
        this.anioFabricacion = 2000;
        this.precio = 0.0;
    }

    public Coche01(String marca, String modelo, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public boolean aplicarDescuento(double descuento) {
        if (anioFabricacion < 2010) {
            precio = precio - (precio * descuento / 100);
            System.out.println("Se aplicó descuento, nuevo precio: " + precio);
            return true;
        } else {
            System.out.println("No se aplicó descuento, coche moderno.");
            return false;
        }
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnioFabricacion() { return anioFabricacion; }
    public void setAnioFabricacion(int anioFabricacion) { this.anioFabricacion = anioFabricacion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
