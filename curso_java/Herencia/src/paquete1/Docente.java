package paquete1;

import java.util.Arrays;

public class Docente extends Persona{
    private String[] materias;
    private String[] horario;

    /* constructor */

    public Docente(String nombre, String apellido, String email, int edad, String telefono, String[] materias, String[] horario) {
        super(nombre, apellido, email, edad, telefono);
        this.materias = materias;
        this.horario = horario;
    }

    /* getters and setters */

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        String separador = "\n==============================================\n";
        String finalMsn = separador + super.toString() + "\n Materias: \n";

        for (String materia: materias){
            finalMsn += "\t-" + materia + '\n';
        }

        finalMsn += "\n Horarios | disponibilidad: \n";
        for (String hora: horario){
            finalMsn += "\t-" + hora + '\n';
        }

        return finalMsn + separador;
    }
}
