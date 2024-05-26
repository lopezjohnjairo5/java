import java.util.Scanner;

/*
* Creado por JJL
* 25/05/2024
* */
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num1, num2, resultado = 0;

        System.out.println("A continuación deberá ingresar 2 numeros enteros y el programa retornará el resultado de la multiplicacion de estos.");

        try {
            System.out.print("Ingrese el primer número: ");
            num1 = scaner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            num2 = scaner.nextInt();

            for (int i = 0; i < Math.abs(num2); i++) {
                resultado += Math.abs(num1);
            }

            if (num1 < 0 && num2 < 0){
                resultado = Math.abs(resultado);
            } else if (num1 < 0 || num2 < 0){
                resultado = -resultado;
            }

            System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es " + resultado);

        } catch (Exception e) {
            System.out.println("\nSolo se reciben valores de tipo INTEGER. Verifique e intente nuevamente.\n");
            main(args);
            System.exit(0);
        }
    }
}