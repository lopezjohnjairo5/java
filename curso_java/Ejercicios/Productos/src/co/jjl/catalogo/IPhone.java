package co.jjl.catalogo;

public class IPhone extends Electronico{
    String modelo;
    String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "\nIPhone{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }
}
