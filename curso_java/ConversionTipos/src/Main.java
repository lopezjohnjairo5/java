//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int entero = 23;
        long enteroLargo = 33000;
        boolean booleano = true;
        float flotante = 12.4f;
        double doble = 123.142;
        char caracter = 'a';

        // convirtiendo valores a String
        String numeroAString = Integer.toString(entero);
        String boolAString = Boolean.toString(booleano);
        String floatAString = Float.toString(flotante);
        String longAString = Float.toString(enteroLargo);
        String doubleAString = Double.toString(doble);
        String caracterToString = Character.toString(caracter);

        System.out.println("numeroAString = " + numeroAString);
        System.out.println("boolAString = " + boolAString);
        System.out.println("floatAString = " + floatAString);
        System.out.println("longAString = " + longAString);
        System.out.println("doubleAString = " + doubleAString);
        System.out.println("caracterToString = " + caracterToString);

        System.out.println("Type numeroAString = " + ((Object)numeroAString).getClass().getSimpleName());
        System.out.println("Type boolAString = " + ((Object)boolAString).getClass().getSimpleName());
        System.out.println("Type floatAString = " + ((Object)floatAString).getClass().getSimpleName());
        System.out.println("Type doubleAString = " + ((Object)doubleAString).getClass().getSimpleName());
        System.out.println("Type caracterToString = " + ((Object)caracterToString).getClass().getSimpleName());

        // convirtiendo Strings a valores
        int stringToInt = Integer.parseInt(numeroAString);
        boolean stringTobool = Boolean.parseBoolean(boolAString);
        float stringToFloat = Float.parseFloat(floatAString);
        //long stringToLong = Long.parseLong(longAString);
        double stringToDouble = Double.parseDouble(doubleAString);

        System.out.println("stringToInt = " + stringToInt);
        System.out.println("stringTobool = " + stringTobool);
        System.out.println("stringToFloat = " + stringToFloat);
        //System.out.println("stringToLong = " + stringToLong);
        System.out.println("stringToDouble = " + stringToDouble);

        System.out.println("Type stringToInt = " + ((Object)stringToInt).getClass().getSimpleName());
        System.out.println("Type stringTobool = " + ((Object)stringTobool).getClass().getSimpleName());
        System.out.println("Type stringToFloat = " + ((Object)stringToFloat).getClass().getSimpleName());
        System.out.println("Type stringToDouble = " + ((Object)stringToDouble).getClass().getSimpleName());


        // cast for numbers
        int floatToInt = (int) flotante;
        float longToFloat = (long) enteroLargo;
        float intToFloat = (float) entero;
        double floatToDouble = (double) flotante;

        // tipos numericos
        System.out.println("Type floatToInt = " + ((Object)floatToInt).getClass().getSimpleName());
        System.out.println("Type longToFloat = " + ((Object)longToFloat).getClass().getSimpleName());
        System.out.println("Type intToFloat = " + ((Object)intToFloat).getClass().getSimpleName());
        System.out.println("Type floatToDouble = " + ((Object)floatToDouble).getClass().getSimpleName());

    }
}