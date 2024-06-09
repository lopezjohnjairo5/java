import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("\n\nGenerando numeros con Math.random\n\n");

        // numero aleatorio usando la clase MATH
        for (int i = 1; i <= 10; i++) {
            int numAleatorio = (int)(Math.random()*10) + 1; // numero aleatorio entre 1 y 10, ambos incluidos
            System.out.println("numAleatorio = " + numAleatorio);
        }

        // usando la clase Java.util para generar numeros random
        // este permite generar nuemros double, float, int, entre otros
        Random otroNumeroRandom = new Random();

        System.out.printf("\n\nGenerando numeros con Java.util.random\n\n");
        for (int i = 1; i <= 10; i++) {
            // pueden tener parametros o no, son opcionales
            int randomInt = otroNumeroRandom.nextInt(1,10);
            float randomFloat = otroNumeroRandom.nextFloat(0.0f,10.0f);
            double randomDouble = otroNumeroRandom.nextDouble(1.8,2.6);
            long randomLong = otroNumeroRandom.nextLong(23,150);

            System.out.println("randomInt = " + randomInt);
            System.out.println("randomFloat = " + randomFloat);
            System.out.println("randomDouble = " + randomDouble);
            System.out.println("randomLong = " + randomLong);
        }

        ArrayList <Integer> listadoNumeros = new ArrayList<Integer>();
        Random numeroAleatorioEntero = new Random();
        while (listadoNumeros.size() < 9){
            int numeroAl = numeroAleatorioEntero.nextInt(1,10);
            if (!listadoNumeros.contains(numeroAl)){
                listadoNumeros.add(numeroAl);
            }
        }

        System.out.println("\n\nlistadoNumeros = \n" + listadoNumeros);

    }
}