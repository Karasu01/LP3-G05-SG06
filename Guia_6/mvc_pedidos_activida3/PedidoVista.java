package mvc_pedidos_activida3;

import java.util.List;
import java.util.Scanner;

public class PedidoVista {
    private Scanner scanner;

    public PedidoVista() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNombrePlato() {
        System.out.print("Introduce el nombre del plato: ");
        return scanner.nextLine();
    }

    public String solicitarTipoPlato() {
        System.out.print("Introduce el tipo de plato: ");
        return scanner.nextLine();
    }

    public int solicitarIndice() {
        System.out.print("Introduce el número del pedido: ");
        return Integer.parseInt(scanner.nextLine()) - 1;
    }

    public String solicitarEstado() {
        System.out.print("Introduce el estado (Pendiente, Completado, Eliminado): ");
        return scanner.nextLine();
    }

    public void mostrarPedidos(List<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos disponibles.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println((i + 1) + ". " + pedidos.get(i));
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ DE PEDIDOS =====");
        System.out.println("1. Agregar Pedido");
        System.out.println("2. Mostrar Todos los Pedidos");
        System.out.println("3. Marcar Pedido como Completado");
        System.out.println("4. Eliminar Pedido");
        System.out.println("5. Mostrar Pedidos por Estado");
        System.out.println("6. Contar Pedidos Pendientes");
        System.out.println("7. Salir");
    }

    public String solicitarOpcion() {
        System.out.print("Selecciona una opción: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}