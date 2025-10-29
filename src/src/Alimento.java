package src;

public class Alimento extends Producto {
    private String fechaExpiracion;

    public Alimento(String nombre, double precio, String fechaExpiracion) {
        super(nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Alimenticio: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
    }
}
