package paquete1;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String telefono;
    protected String accesoEnPaquete = "hola mundo";
    static int countP = 1;
    int finalCount = 0;

    /* constructor */

    public Persona(String nombre, String apellido, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;

        finalCount = countP++;
    }

    /* getters and setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  finalCount + "-" + nombre + '\n' + apellido + '\n' + email + '\n'+ edad + telefono + '\n';
    }
}
