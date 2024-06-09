import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        tipos de arrays existentes
        - array comun
        - MapArray
        - ListArray o ArrayList
        * */
        // arrays comunes con diferentes inicializaciones
        int[] numeros = new int[10]; // el numero indica la cantidad de espacios disponibles en el Array
        char[] vocales = {'a','e','i','o','u'};
        String[] articulos = {"televisor","nevera","licuadora","computador","aspiradora","celular"};
        ArrayList<String> articulosColegio = new ArrayList<>(); // permite agregar la cantidad que se desee de articulos de manera dinamica
        String[] abecedario = new String[26];

        // añadiendo valores al array numeros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        // añadiendo valores al array lista
        articulosColegio.add(0,"lapiz");
        articulosColegio.add(1,"esfero");
        articulosColegio.add(2,"borrador");
        articulosColegio.add(3,"cartuchera");
        articulosColegio.add(4,"marcador");

        // añadiendo valores al array
        abecedario[1] = "a";
        abecedario[0] = "b";
        abecedario[12] = "c";
        abecedario[5] = "d";
        abecedario[4] = "e";
        abecedario[3] = "f";
        abecedario[6] = "g";
        abecedario[17] = "h";
        abecedario[8] = "i";
        abecedario[9] = "j";
        abecedario[10] = "k";
        abecedario[11] = "l";
        abecedario[2] = "m";
        abecedario[13] = "n";
        abecedario[14] = "o";
        abecedario[15] = "p";
        abecedario[16] = "q";
        abecedario[7] = "r";
        abecedario[18] = "s";
        abecedario[19] = "t";
        abecedario[20] = "u";
        abecedario[21] = "v";
        abecedario[25] = "x";
        abecedario[24] = "y";
        abecedario[23] = "z";
        abecedario[22] = "w";

        // ordenamiento de valores de un array
        Arrays.sort(articulos); // clase Arrays de Java.utils
        Arrays.sort(abecedario); // clase Arrays de Java.utils

        Collections.reverse(Arrays.asList(abecedario)); // invertimos el contenido de abecedario, pero primero lo convertimos a una lista
        Collections.sort(articulosColegio); // usando la clase collections de java.utils para ordenar (solo con tipo List)
        Collections.reverse(articulosColegio); // usando la clase collections de java.utils para ordenar de forma inversa (solo con tipo List)

        // diferentes formas de  mostrar arreglos
        // for
        System.out.println("\nMostrando el contenido del array numeros con un for \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }
        System.out.println("\nMostrando el contenido del array numeros (invertido) con un for \n");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }
        //foreach
        System.out.println("\nMostrando el contenido del array vocales con un foreach \n");
        for (char vocal: vocales){
            System.out.println("vocal = " + vocal);
        }

        System.out.println("\nMostrando el contenido del array articulos con un foreach \n");
        for(String articulo: articulos){
            System.out.println("articulo = " + articulo);
        }

        System.out.println("\nMostrando el contenido del array articulosColegio con un foreach \n");
        for(String articuloCol: articulosColegio){
            System.out.println("articuloCol = " + articuloCol);
        }

    }
}