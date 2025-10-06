package mvc_pedidos_actividad2;

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
            pedidos.remove(index);
        }
    }

    public void actualizarPedido(int index, String nuevoNombre, String nuevoTipo) {
        if (index >= 0 && index < pedidos.size()) {
            Pedido pedido = pedidos.get(index);
            pedido.setNombrePlato(nuevoNombre);
            pedido.setTipoPlato(nuevoTipo);
        }
    }

    public List<Pedido> buscarPorNombre(String nombre) {
        List<Pedido> resultados = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getNombrePlato().equalsIgnoreCase(nombre)) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public List<Pedido> buscarPorTipo(String tipo) {
        List<Pedido> resultados = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getTipoPlato().equalsIgnoreCase(tipo)) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public int contarPedidos() {
        return pedidos.size();
    }

    public int contarPorTipo(String tipo) {
        int contador = 0;
        for (Pedido p : pedidos) {
            if (p.getTipoPlato().equalsIgnoreCase(tipo)) {
                contador++;
            }
        }
        return contador;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}