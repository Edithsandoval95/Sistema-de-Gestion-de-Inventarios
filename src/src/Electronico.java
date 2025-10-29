package src;

public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Electrónico: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}
