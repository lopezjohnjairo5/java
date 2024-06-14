import java.util.Scanner;

/*
creado por JJL
12/06/2024
* */
public class Main {
    public static void main(String[] args) {
        /*
        * programa encargado de imprimir el numero mas alto
        * presente en un array de numeros enteros (con rango de 11 a 99)
        * */
        int[] arrayNums = new int[7]; // array de 7 elementos
        arrayNums = createArrayNums(); // llenando el array de numeros ingresados por teclado
        printMaxNumInArray(arrayNums); // imprimiendo el valor mas grande almacenado en el array

    }

    public static int[] createArrayNums(){
        Scanner s = new Scanner(System.in);
        int[] arrayNums = new int[7];
        int arrayLen = 7;
        int passValue;

        System.out.println("A continuación introduzca 7 numeros enteros entre 11 y 99, separados por enter.");

        try {
            for (int i = 0; i < arrayLen; i++) {
                passValue = s.nextInt();
                if (passValue < 11 || passValue > 99){
                    throw new Exception();
                } else {
                    arrayNums[i] = passValue;
                }
            }
        } catch (Exception e){
            System.out.println("El valor introducido es incorrecto (debe ser un valor entero entre 11 y 99). Verifique e intente nuevamente.");
            System.exit(-1);
        }
        return arrayNums;
    }

    public static void printMaxNumInArray(int[] arrayNums){
        int max = arrayNums[0], lenArray = arrayNums.length;

        for (int i = 0; i < lenArray; i++) {
            if (max < arrayNums[i]){
                max = arrayNums[i];
            }
        }

        System.out.println("EL valor mas grande almacenado es: "+ max);
    }
}