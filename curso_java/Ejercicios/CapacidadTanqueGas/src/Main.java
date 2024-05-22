import java.util.Scanner;

/*
* creado por JJL
* 22/05/2024
* */
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double capacidadActual, capacidadMaxima = 70.0;
        Scanner scaner = new Scanner(System.in);

        try {
            System.out.println("Por favor introduzca la medida actual en litros del tanque de gas: ");
            capacidadActual = scaner.nextDouble();

            if (capacidadActual <= capacidadMaxima){
                if (capacidadActual >= 1 && capacidadActual < 20){
                    System.out.println("Gas | Gasolina insuficiente");
                } else if (capacidadActual >= 20 && capacidadActual < 35) {
                    System.out.println("Gas | Gasolina suficiente");
                } else if (capacidadActual >= 35 && capacidadActual < 40) {
                    System.out.println("Gas | Gasolina medio tanque");
                } else if (capacidadActual >= 40 && capacidadActual < 60) {
                    System.out.println("Gas | Gasolina 3/4 de tanque");
                } else if (capacidadActual >= 60 && capacidadActual < 70) {
                    System.out.println("Gas | Gasolina tanque casi lleno");
                } else {
                    System.out.println("Gas | Gasolina tanque lleno");
                }
            } else {
                System.out.println("La capacidad maxima del tanque es de " + Double.toString(capacidadMaxima));
            }

        } catch (Exception e) {
            System.out.println("\nEl valor introducido es incorrecto (para valores con decimales, por favor utilice coma (,) en lugar de punto). \nPor favor verifique e intente nuevamente.\n");
            main(args);
            System.exit(0);
        }

    }
}