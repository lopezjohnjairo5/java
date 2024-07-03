package paquete2;
import paquete1.Persona;
import paquete1.Docente;

public class EjemploAcceso {

    public static void main (String[] args){
        String[] materias2 = {"tecnologia","audio visuales"};
        String[] horarios2 = {"mañana"};

        Persona personaEj = new Persona("jorge", "cardenas", "jorgecar@gmail.com",34,"3132432323");
        Docente docente2 = new Docente("jairo", "estepa", "jaes@gmail.com",34,"3002432323",materias2, horarios2);

        // intentando acceder al atributo marcado como protected del paquete 1, desde el paquete 2

        //System.out.println(personaEj.accesoEnPaquete); // no es posible acceder a el ya que los elementos protected solo son accesibles dentro del paquete al cual pertenecen

        // imprimiendo la info de personaEj
        System.out.println(personaEj);
        System.out.println(docente2);
    }
}
