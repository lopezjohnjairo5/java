import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // creando obj fecha
        Date fecha = new Date();
        System.out.println("fecha actual: "+ fecha);

        // creando obj simpledateformat para dar un nuevo formato a la fecha
        SimpleDateFormat fechaConFormato = new SimpleDateFormat("dd MMMM, YY");
        String fechaFormateada = fechaConFormato.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada);

        SimpleDateFormat fechaConFormato2 = new SimpleDateFormat("dd-MM-YY");
        String fechaFormateada2 = fechaConFormato2.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada2);

        SimpleDateFormat fechaConFormato3 = new SimpleDateFormat("YY/MM/dd");
        String fechaFormateada3 = fechaConFormato3.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada3);

        SimpleDateFormat fechaConFormato4 = new SimpleDateFormat("yyyy-MMMM-dd");
        String fechaFormateada4 = fechaConFormato4.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada4);

        SimpleDateFormat fechaConFormato5 = new SimpleDateFormat("DD-MM-YY"); // la DD muestra el numero de dias transcurridos desde enero del presente año hasta la fecha actual
        String fechaFormateada5 = fechaConFormato5.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada5);

        SimpleDateFormat fechaConFormato6 = new SimpleDateFormat("yyy.MM.dd G 'at' HH:mm:ss z"); // la mm hace referencia a minutos y la MM hace referencia a mes, z es la zona horaria, la G indica a.c ó d.c
        String fechaFormateada6 = fechaConFormato6.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada6);

        SimpleDateFormat fechaConFormato7 = new SimpleDateFormat("EEEE dd 'de' MMMM,yyyy"); // la EEEE indica el dia de la semana en formato texto
        String fechaFormateada7 = fechaConFormato7.format(fecha);
        System.out.println("fecha con formato= " + fechaFormateada7);

        /*
        * y = año                                                   EJ: 1996; 96
        * Y = semana del año                                        EJ: 2009; 09
        * w = semana del año                                        EJ: 27
        * W = semana del mes                                        EJ: 2
        * D = dia en el año                                         EJ: 189
        * d = dia en el mes                                         EJ: 10
        * F = dia de la semana en el mes                            EJ: 2
        * E = nombre del dia en la semana                           EJ: Tuesday; Tue
        * u = numero de dia en la semana(1= lunes, 7= domingo)      EJ: 1
        * a = Am/Pm marcador                                        EJ: 1
        * H = hora en el dia (0-23)
        * k = hora en el dia(1-24)
        * K = hora en el dia am/pm(0-11)                            EJ: 0
        * h = hora en el dia am/pm(1-12)                            EJ: 12
        * m = minutos en hora                                       EJ: 30
        * s = segundos en minuto                                    EJ: 55
        * S = millisegundos                                         EJ: 978
        * */
    }
}