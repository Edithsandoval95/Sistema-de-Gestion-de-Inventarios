package src;

public class
Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Electronico("Laptop Lenovo", 15000.0, 24);
        Producto p2 = new Alimento("Manzana", 8.5, "2025-11-15");
        Producto p3 = new Ropa("Camisa", 350.0, "M");

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        System.out.println("Inventario completo:");
        inventario.mostrarInventario();
    }
}
