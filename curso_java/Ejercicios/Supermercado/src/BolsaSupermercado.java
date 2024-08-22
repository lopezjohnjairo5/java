import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T> {
    public List<T> productos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){

        try {
            this.productos.add(producto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}
