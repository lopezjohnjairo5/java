import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fechaNacimientoString;

        System.out.println("El presente programa calculará su edad a partir de la fecha de nacimiento.");

        System.out.print("Por favor ingrese su fecha de nacimiento (Dia-mes-año -> 2-5-2005): ");
        fechaNacimientoString = scanner.next();

        edadGeneral(fechaNacimientoString);
    }

    public static void edadGeneral(String fechaNacimientoString){
        /*
        * metodo encargado de obtener la edad con
        * precision aproximada
        * */
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        Date fechaActual = new Date();
        int miliSegundosDia = 86400000, diasAnno = 365;

        try{
            Date fechaNacimientoDate = formato.parse(fechaNacimientoString);
            // restamos la fecha actual y la fecha introducida por el usuario, la dividimos por el numero de milisegundos en el dia
            // para obtener la cantidad de dias transcurridos y luego dividimos la cantidad de dias en 365 que son los días que tiene un año
            // asi obtenemos la edad del usuario
            int edadUsuario = (int) (((fechaActual.getTime() - fechaNacimientoDate.getTime())/miliSegundosDia)/diasAnno);
            System.out.println("La edad de usuario es: " + edadUsuario + " años");
        } catch (Exception e){
            System.out.println("Error al calular la edad. Verifique la informacion ingresada e intente nuevamente.\n");
        }
    }
}