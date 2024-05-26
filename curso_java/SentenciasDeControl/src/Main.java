import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // uso de condicionales IF
        // determinando si el mes ingresado por el usuario tiene 30, 31 o 28 dias
        Scanner scaner = new Scanner(System.in);
        int year = 0, month = 0;

        try {
            System.out.println("El siguiente programa verifica la cantidad de días que tiene un mes segun el año y el N° del mes introducido.\n");
            System.out.println("A continuación el año:");
            year =  scaner.nextInt();

            System.out.println("A continuación ingrese un numero de mes (ej: enero = 1, febrero = 2, etc...):");
            month =  scaner.nextInt();

            if (year < 1900 || month < 0 || month > 12){
                System.out.println("valores incorrectos, se requiere un año mayor o igual a 1900 y un mes entre 1 y 12. ");
                throw new Exception();
            }

        } catch (Exception e){
            System.out.println("Solo se reciben valores de tipo entero. Verifique e intente nuevamente.\n");
            main(args);
            System.exit(0);
        }

        // uso de concat solo para variar.
        System.out.println("Verificando con IF: \nEl mes ".concat(Integer.toString(month)).concat(" - ").concat(getNameMonth(month)).concat(" ").concat(verifyMonthWithIf(month, year)));
        System.out.println("Verificando con Switch: \nEl mes ".concat(Integer.toString(month)).concat(" - ").concat(getNameMonth(month)).concat(" ").concat(verifyMonthWithSwitch(month, year)));
    }

    public  static  String getNameMonth(int numMonth){
        // creando diccionario con los valores que corresponden al numero del mes
        Map<Integer, String> monthsDiccionary = new HashMap<Integer, String>();
        monthsDiccionary.put(1,"Enero");
        monthsDiccionary.put(2,"Febrero");
        monthsDiccionary.put(3,"Marzo");
        monthsDiccionary.put(4,"Abril");
        monthsDiccionary.put(5,"Mayo");
        monthsDiccionary.put(6,"Junio");
        monthsDiccionary.put(7,"Julio");
        monthsDiccionary.put(8,"Agosto");
        monthsDiccionary.put(9,"Septiembre");
        monthsDiccionary.put(10,"Octubre");
        monthsDiccionary.put(11,"Noviembre");
        monthsDiccionary.put(12,"Diciembre");

        return monthsDiccionary.get(numMonth);
    }

    public static String verifyMonthWithIf(int numMonth, int year){
        String numDaysOfMonth = "";
        boolean bisiesto = ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);

        if (numMonth == 1 || numMonth == 3 || numMonth == 5 || numMonth == 7 || numMonth == 8 || numMonth == 10 || numMonth == 12){
            numDaysOfMonth = "Tiene 31 dias";
        } else if (numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11) {
            numDaysOfMonth = "Tiene 30 dias";
        } else if (numMonth == 2 && bisiesto) {
            numDaysOfMonth = "Tiene 29 dias ya que el presente año es bisiesto";
        } else {
            numDaysOfMonth = "Tiene 28 dias";
        }

        return numDaysOfMonth;
    }

    public static String verifyMonthWithSwitch(int numMonth, int year){
        String numDaysOfMonth = "";
        boolean bisiesto = ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);

        switch (numMonth){
            case 1,3,5,7,8,10,12:
                numDaysOfMonth = "Tiene 31 dias";
                break;
            case 4,6,9,11:
                numDaysOfMonth = "Tiene 30 dias";
                break;
            case 2:
                if (numMonth == 2 && bisiesto) {
                    numDaysOfMonth = "Tiene 29 dias ya que el presente año es bisiesto";
                } else {
                    numDaysOfMonth = "Tiene 28 dias";
                }
                break;
        }

        return numDaysOfMonth;
    }
}