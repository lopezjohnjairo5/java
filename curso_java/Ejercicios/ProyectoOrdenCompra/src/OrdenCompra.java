import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * @author JJLE
 * 2024-06-25
 * */

public class OrdenCompra {
    private int autoincremental;
    private static int increment;
    private String descripcion;
    private String fecha; // la pongo String para usar simpledateformat y dar una mejor visualizacion
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private double totalP;
    private int idProduct;
    /* constructor */

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.autoincremental += ++increment; // en el ejercicio no pide poner el autoincremental en el constructor, pero igual lo puse
    }

    /* getters */

    public Integer getAutoincremental() {
        return this.autoincremental;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getFecha() {
        return this.fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Producto[] getProductos() {
        return this.productos;
    }

    /* setters */

    public void setFecha(Date fecha) {
        String patron = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(patron);
        this.fecha = sdf.format(fecha);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        this.productos[this.idProduct++] = producto;
    }

    /* other methods */

    public double getTotalProducts(){
        for (Producto product: productos){
            this.totalP += product.getPrecio();
        }

        return this.totalP;
    }
}
