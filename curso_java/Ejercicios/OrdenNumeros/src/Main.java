import java.util.Scanner;

/*
* creado por JJL
* 22/05/2024
* */
public class Main {
    public static void main(String[] args) {
        float num1, num2, mayor, menor;
        Scanner scaner = new Scanner(System.in); // obj scanner

        try {
            System.out.println("Ingrese el primer numero");
            num1 = scaner.nextFloat();

            System.out.println("Ingrese el segundo numero");
            num2 = scaner.nextFloat();

            if (num1 != num2) {
                mayor = num1 > num2 ? num1 : num2;
                menor = num1 < num2 ? num1 : num2;

                System.out.println("mayor = " + mayor);
                System.out.println("menor = " + menor);
            } else {
                System.out.println("Los números son iguales");
            }

        } catch (Exception e){
            main(args);
            System.exit(0);
        }

    }
}