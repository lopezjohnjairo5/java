import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args){
        // trabajando con calendarios
        Calendar calendario = Calendar.getInstance();

        // agregando todos los valores necesarios para trabajar con la fecha
        //calendario.set(2024, 4, 17, 11,40,15); // año, mes(inicia en 0) , dia , hora(opc), minuto(opc), segundo(opc)

        // agregando valores individuales, lo mismo que lo anterior, pero de manera individual y con constantes
        calendario.set(Calendar.YEAR, 2024); // constante, valor
        calendario.set(Calendar.MONTH, Calendar.MAY); // Los meses inician en Cero como un array, por lo cual Enero = 0, Febrero = 1, etc.... Tambien se puede usar la constante que representa al mes como en este caso calendar.JULY por ej.
        calendario.set(Calendar.DAY_OF_MONTH, 30);

        // (opcionales), hora, minuto, segundo
        calendario.set(Calendar.HOUR, 11);
        calendario.set(Calendar.MINUTE, 40);
        calendario.set(Calendar.SECOND,15);

        Date fecha = calendario.getTime();// asignamos el calendario creado a una fecha nueva

        System.out.println("fecha mediante el uso de calendario = " + fecha);

        // dando formato a la fecha
        SimpleDateFormat nuevoFormato = new SimpleDateFormat("YYYY - MM - dd | HH:mm:ss");
        String fechaConFormato = nuevoFormato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
