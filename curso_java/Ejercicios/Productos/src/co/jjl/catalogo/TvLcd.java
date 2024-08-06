package co.jjl.catalogo;

public class TvLcd extends Electronico{
    int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "\nTvLcd{" +
                "pulgada=" + pulgada +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }
}
