package mvc_pedidos_activida3;

import java.util.List;

public class PedidoControlador {
    private PedidoModelo modelo;
    private PedidoVista vista;

    public PedidoControlador(PedidoModelo modelo, PedidoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarPedido() {
        String nombre = vista.solicitarNombrePlato();
        String tipo = vista.solicitarTipoPlato();
        modelo.agregarPedido(new Pedido(nombre, tipo));
        vista.mostrarMensaje("Pedido agregado exitosamente.");
    }

    public void mostrarPedidos() {
        vista.mostrarPedidos(modelo.getPedidos());
    }

    public void marcarPedidoCompleto() {
        vista.mostrarPedidos(modelo.getPedidos());
        int index = vista.solicitarIndice();
        modelo.marcarCompleto(index);
        vista.mostrarMensaje("Pedido marcado como completado.");
    }

    public void eliminarPedido() {
        vista.mostrarPedidos(modelo.getPedidos());
        int index = vista.solicitarIndice();
        modelo.eliminarPedido(index);
        vista.mostrarMensaje("Pedido marcado como eliminado.");
    }

    public void mostrarPorEstado() {
        String estado = vista.solicitarEstado();
        List<Pedido> filtrados = modelo.filtrarPorEstado(estado);
        vista.mostrarPedidos(filtrados);
    }

    public void contarPendientes() {
        int total = modelo.contarPendientes();
        vista.mostrarMensaje("Total de pedidos pendientes: " + total);
    }

    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            switch (opcion) {
                case "1" -> agregarPedido();
                case "2" -> mostrarPedidos();
                case "3" -> marcarPedidoCompleto();
                case "4" -> eliminarPedido();
                case "5" -> mostrarPorEstado();
                case "6" -> contarPendientes();
                case "7" -> vista.mostrarMensaje("Saliendo del sistema...");
                default -> vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("7"));
        vista.cerrarScanner();
    }
}
