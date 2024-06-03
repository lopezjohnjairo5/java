import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TrabajoConFechas {
    public static void main(String[] args){
        Date fecha1 = new Date(); // tiene la fecha actual

        Calendar nuevaFecha = Calendar.getInstance(); // se usa calendario para definir una fecha propia
        nuevaFecha.set(2025,05,10);

        Date fecha2 = nuevaFecha.getTime(); // convirtiendo la fecha de calendario a obj de fecha Date

        if (fecha1.after(fecha2)){ // after o before para comparar las fechas, no sirve usar operadores de comparacion como < ó >
            System.out.println("La fecha actual es mayor a la fecha 2");
        } else {
            System.out.println("La fecha 2 es mayor a la fecha 1");
        }

        if (fecha1.compareTo(fecha2) > 0){ // se usa cero por  que retorna un INT dependiendo de si es mayor, menor o igual las 2 fechas
            System.out.println("La fecha 1 es mayor a la fecha 2");
        } else if (fecha1.compareTo(fecha2) < 0){
            System.out.println("La fecha 1 es anterior a la fecha 2");
        } else if (fecha1.compareTo(fecha2) == 0) {
            System.out.println("Las fechas son iguales ");
        }
    }
}
