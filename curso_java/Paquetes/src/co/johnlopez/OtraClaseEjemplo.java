package co.johnlopez;// paquete al cual pertenece

public class OtraClaseEjemplo {
    private String nombre;
    private String apellido;

    public OtraClaseEjemplo(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
