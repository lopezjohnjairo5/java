import java.util.Scanner;

/* creado por JJLE*/

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        float porcentaje = 19f;
        String nameFact;
        double precio1;
        double precio2;

        nameFact = getNameFacture(scaner);
        precio1 = getPrice(scaner);
        precio2 = getPrice(scaner);

        calcTotal(nameFact, precio1, precio2, porcentaje);
    }

    public static String getNameFacture(Scanner scaner){
        System.out.println("Introduzca el nombre de la factura o descripcion: ");
        String nombreFactura = scaner.nextLine();
        return nombreFactura;
    }

    public static double getPrice(Scanner scaner){
        System.out.println("Precio producto 1: ");
        double precio = scaner.nextDouble();
        return precio;
    }

    public static void calcTotal(String nameFact, double precio1, double precio2, float porcentaje){
        double suma = precio1 + precio2;
        double total = suma + ((suma * porcentaje)/100);
        String mensaje = "";

        mensaje = "\nLa factura \"" + nameFact + "\"";
        mensaje += " Tiene un valor bruto de: " + suma + ", ";
        mensaje += " con un impuesto aplicado del: " + porcentaje + "%";
        mensaje += " tiene un valor total de: " + total + "\n";

        System.out.println(mensaje);
    }
}