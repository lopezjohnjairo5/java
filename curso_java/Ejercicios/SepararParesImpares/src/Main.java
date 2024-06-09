import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        String continuar = "si";
        int valorIngresado;


        while (continuar.toLowerCase().startsWith("s")){
            System.out.println("A continuación introduzca numeros enteros. ");
            valorIngresado = scaner.nextInt();
            System.out.println("desea ingresar otro valor: (s/n)");
            continuar = scaner.next();
            if ((valorIngresado % 2) == 0){
                pares.add(valorIngresado);
            } else {
                impares.add(valorIngresado);
            }
        }

        printValues("Pares: ", pares);
        printValues("Impares: ", impares);

    }

    public static void printValues(String mensaje, ArrayList<Integer> miArray){
        int cantidad = miArray.size();
        System.out.println("Existen " + cantidad + " numeros " + mensaje);
        for (int i = 0; i < cantidad; i++) {
            System.out.println(mensaje + miArray.get(i));
        }
    }
}