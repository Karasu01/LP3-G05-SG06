public interface Forma {
 void dibujar();
}
public class Circulo implements Forma {
 @Override
 public void dibujar() {
     System.out.println("Dibujando un circulo.");
 }
}
public class Rectangulo implements Forma {
 @Override
 public void dibujar() {
     System.out.println("Dibujando un rectangulo.");
 }
}
public class Triangulo implements Forma {
 @Override
 public void dibujar() {
     System.out.println("Dibujando un triangulo.");
 }
}
public class MainOCP {
 public static void main(String[] args) {
     Forma[] formas = { new Circulo(), new Rectangulo(), new Triangulo() };
     for (Forma f : formas) {
         f.dibujar();
     }
  }
}
