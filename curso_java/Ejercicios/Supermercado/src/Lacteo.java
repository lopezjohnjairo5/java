public class Lacteo extends Producto{
    private Integer cantidad;
    private Integer proteinas;

    public Lacteo(String nombre, Double precio, Integer cantidad, Integer proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public Integer getProteinas() {
        return this.proteinas;
    }
}
