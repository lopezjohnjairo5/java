/*
 * @author JJLE
 * 2024-06-25
 * */

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /* getters */

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    @Override
    public String toString() {
        return "Cliente " + this.nombre + " " + this.apellido;
    }
}
