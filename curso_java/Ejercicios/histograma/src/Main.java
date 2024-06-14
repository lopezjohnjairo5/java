import java.util.Scanner;
import java.util.TreeMap;

/*
 * creado por JJL
 * 13/06/2024
 * */

public class Main {
    public static void main(String[] args) {
        /*
         histograma es una representación gráfica (de puntos o barra) que representa el N° de apariciones de un elemento
         en un conjunto de datos, es decir: el presente programa mostrará la cantidad de veces que aparecen
         los números del array (entre el rango 1 al 6), incluso si no están presente en el arreglo.

        ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

        1: ***
        2:
        3: *
        4: *****
        5: *
        6: **
        NOTA: se trabajará con un array de 12 elementos y valores entre el 1 y 6 incluidos ambos
        * */
        createArrayNums(); // creamos el array con los valores y un treemap con la cantidad de apariciones representado con "*" asteriscos
    }

    public static void createArrayNums(){
        Scanner s = new Scanner(System.in);
        int[] arrayNums = new int[12];
        int arrayLen = 12;
        int passValue = 0;
        TreeMap<Integer, String> numCount = new TreeMap<>();

        numCount = initTreemap(numCount); // inicializamos el treemap con valores por defecto

        System.out.println("A continuación introduzca 12 numeros enteros (entre 1 y 6), separados por enter.");

        // obtenemos los valores por teclado y vamos agregandolos al treemap y al array de numeros
        try {
            for (int i = 0; i < arrayLen; i++) {
                System.out.print((i+1) + "> ");
                passValue = s.nextInt();
                if (passValue < 1 || passValue > 6){
                    throw new Exception();
                } else {
                    numCount.put(passValue, numCount.get(passValue)+"*");
                    arrayNums[i] = passValue;
                }
            }
        } catch (Exception e){
            System.out.println("El valor introducido es incorrecto (debe ser valores de tipo entero entre 1 y 6). Verifique e intente nuevamente.");
            System.exit(-1);
        }

        // imprimimos
        System.out.println("\nContenido introducido:\n");
        printArrayContent(arrayNums);

        System.out.println("\nHistograma:\n");
        printTreeContent(numCount);
    }

    public static TreeMap initTreemap(TreeMap<Integer, String> treeM){
        // llenamos el treemap con valores vacios del 1 al 6
        for (int i = 1; i <= 6; i++) {
            treeM.put(i,"");
        }
        return  treeM;
    }

    public static void printTreeContent(TreeMap<Integer, String> treeM){
        for (int i = 1; i <= 6; i++) {
            System.out.println(i +": "+ treeM.get(i));
        }
    }

    public static void printArrayContent(int[] arrayNums){
        for (int item: arrayNums){
            System.out.print(item + " , ");
        }
        System.out.println();
    }
}