package src;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        for (Producto p : productos) {
            p.mostrarInformacion();
            System.out.println("-------------------");
        }
    }
}
