import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * creado por JJL
 * 12/06/2024
 * */

public class Main {
    public static void main(String[] args) {
        /*
        programa encargado de crear un arreglo de 10 elementos
        enteros en el rango de 1 a 9, y de imprimir el número con mas apariciones en el arreglo junto a
        la cantidad de veces que aparece.
        ej:
        - arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        - resultado:
                > La mayor ocurrencias es: 3
                > El elemento que mas se repite es: 5
        * */
        int[] arrayNums = new int[10];
        arrayNums = createArrayNums(); // llenamos el array con valores introducidos por teclado
        searchMoreRepeated(arrayNums); // recorriendo el array para saber cual es el elemento con mas repeticiones
    }

    public static int[] createArrayNums(){
        Scanner s = new Scanner(System.in);
        int[] arrayNums = new int[10];
        int arrayLen = 10;

        System.out.println("A continuación introduzca 10 numeros enteros (entre 1 y 9), separados por enter.");

        try {
            for (int i = 0; i < arrayLen; i++) {
                System.out.print((i+1) + "> ");
                arrayNums[i] = s.nextInt();
            }
        } catch (Exception e){
            System.out.println("El valor introducido es incorrecto (debe ser valores de tipo entero entre 1 y 9). Verifique e intente nuevamente.");
            System.exit(-1);
        }
        return arrayNums;
    }

    public static void  searchMoreRepeated(int[] arrayNums){
        // {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        int lenArray = arrayNums.length;
        //HashMap<Integer, Integer> numCount = new HashMap<>(); // almacena el numero del array como clave y la cantidad de apariciones como valor
        TreeMap<Integer, Integer> numCount = new TreeMap<>(); // metodo "NOVEDOSO", hago uso de un treeMap para ordenar el contenido,automaticamente

        for (int i = 0; i < lenArray-1; i++) {
            for (int j = i+1; j < lenArray; j++) {
                if (arrayNums[i] != 0){ // si el valor presente en el array es 0, significa que ya no se debe tener en cuenta para la comparacion
                    // verificamos si el elemento a comparar ya se encuentra como clave en el HASHMAP
                    if (!numCount.containsKey(arrayNums[i])){
                        numCount.put(arrayNums[i], 1);
                    }
                    // comparamos los valores
                    if (arrayNums[i] == arrayNums[j]){
                        numCount.put(arrayNums[i], numCount.get(arrayNums[i]) + 1);
                        arrayNums[j] = 0;
                    }
                }
            }

        }

        getMoreRepeated(numCount);
    }

    public static void getMoreRepeated(TreeMap<Integer, Integer> map){
        int maxValue = 0;
        int maxNum = 0;
        int secondMaxValue = 0;
        int secondMaxNum = 0;

        for (Map.Entry<Integer, Integer> element: map.entrySet()){
            if ( element.getValue() > maxValue ){
                maxValue = element.getValue();
                maxNum = element.getKey();
            } else if ( element.getValue() == maxValue ) {
                secondMaxValue = element.getValue();
                secondMaxNum = element.getKey();
            }
        }
        System.out.println("El elemento mas repetido en el array es: "+ maxNum);
        System.out.println("Aparece: "+ maxValue + " veces");
        if (secondMaxValue != 0){
            System.out.println("¡Uppss!, parece que el numero: " + secondMaxNum + " tiene la misma cantidad de repeticiones: " + secondMaxValue);
        }
    }
}