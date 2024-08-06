package co.jjl.catalogo;

abstract public class Electronico extends Producto implements IElectronico{
    String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return "";
    }
}
