package paquete1;

public class Alumno extends Persona{
    private String institucion;
    private String grado;

    /* constructor */

    public Alumno(String nombre, String apellido, String email, int edad, String telefono, String institucion, String grado) {
        super(nombre, apellido, email, edad, telefono); // super invoca al constructor del padre, se usa cuando
                                                        // el constructor del padre requiere inicializacion de parametros,
                                                        // debe ser el primero en el constructor del hijo al
                                                        // invocarse, de lo contrario dará error
        this.institucion = institucion;
        this.grado = grado;
    }

    /* getters and setters */

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        String separador = "\n==============================================\n";
        return separador + super.toString() + institucion + '\n' + grado + '\n' + accesoEnPaquete + '\n' + separador;
    }
}
