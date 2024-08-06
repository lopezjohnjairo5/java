package co.jjl.catalogo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comics extends Libro{
    String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "\nComics{" +
                "personaje='" + personaje + '\'' +
                ", fechaPublicacion=" + new SimpleDateFormat("yyyy-MM-dd").format(fechaPublicacion) +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", precio=" + precio +
                '}';
    }
}
