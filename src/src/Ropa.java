package src;

public class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto de Ropa: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talla: " + talla);
    }
}
