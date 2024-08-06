package co.jjl.catalogo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro extends Producto implements ILibro{
    Date fechaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return null;
    }

    @Override
    public String getAutor() {
        return "";
    }

    @Override
    public String getTitulo() {
        return "";
    }

    @Override
    public String getEditorial() {
        return "";
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "\nLibro{" +
                "precio=" + precio +
                ", editorial='" + editorial + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion=" + new SimpleDateFormat("yyyy-MM-dd").format(fechaPublicacion) +
                '}';
    }
}
