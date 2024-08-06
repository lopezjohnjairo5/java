package co.jjl.catalogo;

abstract public class Producto implements IProducto{
    int precio;

    /*construct*/
    public Producto(int precio) {
        this.precio = precio;
    }

    /*getters*/
    @Override
    public int getPrecio() {
        return 0;
    }

    /*override methods*/
    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
