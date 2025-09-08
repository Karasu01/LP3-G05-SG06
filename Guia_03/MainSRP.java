public class CalculadoraPago {
 public double calcularPagoMensual(Empleado empleado) {
     return empleado.getSalario() / 12;
 }
}
public class Empleado {
 private String nombre;
 private double salario;
 private String departamento;

 public Empleado(String nombre, double salario, String departamento) {
     this.nombre = nombre;
     this.salario = salario;
     this.departamento = departamento;
 }

 public String getNombre() { return nombre; }
 public double getSalario() { return salario; }
 public String getDepartamento() { return departamento; }
}
public class MainSRP {
 public static void main(String[] args) {
     Empleado emp = new Empleado("Carlos", 24000, "TI");
     CalculadoraPago calc = new CalculadoraPago();
     System.out.println("Pago mensual: " + calc.calcularPagoMensual(emp));
 }
}
