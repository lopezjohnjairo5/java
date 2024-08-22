public class NoPerecedero extends Producto{
    private Integer contenido;
    private Integer calorias;

    public NoPerecedero(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return this.contenido;
    }

    public Integer getCalorias() {
        return this.calorias;
    }
}
