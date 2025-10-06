package mvc_pedidos_activida3;

import java.util.ArrayList;
import java.util.List;

public class PedidoModelo {
    private List<Pedido> pedidos;

    public PedidoModelo() {
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            pedidos.get(index).setEstado("Eliminado");
        }
    }

    public void marcarCompleto(int index) {
        if (index >= 0 && index < pedidos.size()) {
            pedidos.get(index).setEstado("Completado");
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Pedido> filtrarPorEstado(String estado) {
        List<Pedido> filtrados = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getEstado().equalsIgnoreCase(estado)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int contarPendientes() {
        int contador = 0;
        for (Pedido p : pedidos) {
            if (p.getEstado().equalsIgnoreCase("Pendiente")) {
                contador++;
            }
        }
        return contador;
    }
}