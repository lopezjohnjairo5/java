import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringAFecha {
    public  static void main(String[] args){
        String anno, mes, dia, fechaCompleta;

        Scanner scaner = new Scanner(System.in);
        System.out.println("Año: ");
        anno = scaner.nextLine();

        System.out.println("Mes: ");
        mes = scaner.nextLine();

        System.out.println("Dia: ");
        dia = scaner.nextLine();

        fechaCompleta = anno.concat("|").concat(mes).concat("|").concat(dia);
        System.out.println("fechaCompleta = " + fechaCompleta);

        // creando fecha con formato
        SimpleDateFormat formato = new SimpleDateFormat("YYYY|MM|dd");
        try {
            Date nuevaFecha = formato.parse(fechaCompleta); // convirtiendo de String a Obj fecha
            System.out.println("nuevaFecha = " + nuevaFecha);
            System.out.println("Con formato = " + formato.format(nuevaFecha));
        } catch (ParseException e) {
            // parseException es un error que genera el OBJ Date
            e.printStackTrace();
        }

    }
}
