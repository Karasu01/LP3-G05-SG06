package mvc_pedidos_actividad2;

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
        vista.mostrarMensaje("Pedido agregado correctamente.");
    }

    public void eliminarPedido() {
        vista.mostrarPedidos(modelo.getPedidos());
        int index = vista.solicitarIndice();
        modelo.eliminarPedido(index);
        vista.mostrarMensaje("Pedido eliminado con éxito.");
    }

    public void actualizarPedido() {
        vista.mostrarPedidos(modelo.getPedidos());
        int index = vista.solicitarIndice();
        String nuevoNombre = vista.solicitarNombrePlato();
        String nuevoTipo = vista.solicitarTipoPlato();
        modelo.actualizarPedido(index, nuevoNombre, nuevoTipo);
        vista.mostrarMensaje("Pedido actualizado correctamente.");
    }

    public void buscarPorNombre() {
        String nombre = vista.solicitarNombrePlato();
        List<Pedido> resultados = modelo.buscarPorNombre(nombre);
        vista.mostrarPedidos(resultados);
    }

    public void buscarPorTipo() {
        String tipo = vista.solicitarTipoPlato();
        List<Pedido> resultados = modelo.buscarPorTipo(tipo);
        vista.mostrarPedidos(resultados);
    }

    public void contarPedidos() {
        int total = modelo.contarPedidos();
        vista.mostrarMensaje("Total de pedidos: " + total);
    }

    public void contarPorTipo() {
        String tipo = vista.solicitarTipoPlato();
        int total = modelo.contarPorTipo(tipo);
        vista.mostrarMensaje("Total de pedidos del tipo '" + tipo + "': " + total);
    }

    public void mostrarPedidos() {
        vista.mostrarPedidos(modelo.getPedidos());
    }

    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            switch (opcion) {
                case "1" -> agregarPedido();
                case "2" -> mostrarPedidos();
                case "3" -> eliminarPedido();
                case "4" -> actualizarPedido();
                case "5" -> buscarPorNombre();
                case "6" -> buscarPorTipo();
                case "7" -> contarPedidos();
                case "8" -> contarPorTipo();
                case "9" -> vista.mostrarMensaje("Saliendo...");
                default -> vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("9"));
        vista.cerrarScanner();
    }
}