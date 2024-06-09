import java.util.Scanner;
/*
* creado por : JJL
* 04/06/2024
* */
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        float radio, area;
        System.out.println("El presente programa tiene como objetivo calcular el area de un circulo a partir del radio.");

        try{
            System.out.println("Por favor ingrese el radio del circulo: ");
            radio = scaner.nextFloat();
            area = (float)(Math.PI * Math.pow(radio,2));
            System.out.println("El area del circulo con radio: "+Float.toString(radio)+" es: "+ Float.toString(area));
        }catch (Exception e){
            System.out.println("El valor introducido es incorrecto. Si desea utilizar decimales, por favor utilice la coma (,) en lugar del punto(.)\n\n");
            main(args);
            System.exit(0);
        }

    }
}