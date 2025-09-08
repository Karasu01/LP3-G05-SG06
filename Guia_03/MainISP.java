public interface Escaneable {
 void escanear();
}
public class Impresora implements Imprimible {
 @Override
 public void imprimir() {
     System.out.println("Imprimiendo documento...");
 }
}
public class ImpresoraMultifuncional implements Imprimible, Escaneable {
 @Override
 public void imprimir() {
     System.out.println("Imprimiendo con multifuncional...");
 }

 @Override
 public void escanear() {
     System.out.println("Escaneando documento...");
 }
}
public interface Imprimible {
 void imprimir();
}
public class MainISP {
 public static void main(String[] args) {
     Imprimible impresora = new Impresora();
     impresora.imprimir();

     ImpresoraMultifuncional multifuncional = new ImpresoraMultifuncional();
     multifuncional.imprimir();
     multifuncional.escanear();
 }
}
