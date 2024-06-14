import java.util.Scanner;

/*
* creado por JJL
* 12/06/2024
* */
public class Main {
    public static void main(String[] args) {
        /*
        * programa encargado de leer 7 números por teclado
        * y llenar un arreglo para calcular el promedio de los números positivos
        * , negativos y la cantidad de ceros.
        * */
        int[] arrayNums = new int[7];
        arrayNums = createArrayNums(); // llenando el array de numeros ingresados por teclado
        calcPromPositiveNegativeCountZeros(arrayNums); // recorriendo el array y calculando promedios
    }

    public static int[] createArrayNums(){
        Scanner s = new Scanner(System.in);
        int[] arrayNums = new int[7];
        int arrayLen = 7;

        System.out.println("A continuación introduzca 7 numeros enteros, separados por enter.");

        try {
            for (int i = 0; i < arrayLen; i++) {
                System.out.print((i+1) + "> ");
                arrayNums[i] = s.nextInt();
            }
        } catch (Exception e){
            System.out.println("El valor introducido es incorrecto (debe ser valores de tipo entero). Verifique e intente nuevamente.");
            System.exit(-1);
        }
        return arrayNums;
    }

    public static void calcPromPositiveNegativeCountZeros(int[] arrayNums){
        double promPositives = 0.0, promNegatives = 0.0;
        int countZeros = 0, countNegatives = 0, countPositives = 0, lenArray = arrayNums.length;

        for (int i = 0; i < lenArray; i++) {
            if (arrayNums[i] > 0) {
                countPositives++;
                promPositives += arrayNums[i];
            } else if (arrayNums[i] < 0) {
                countNegatives++;
                promNegatives += arrayNums[i];
            } else if (arrayNums[i] == 0) {
                countZeros++;
            }
        }

        promPositives = countPositives > 0 ? promPositives / countPositives : 0.0;
        promNegatives = countNegatives > 0 ? promNegatives / countNegatives : 0.0;

        System.out.println("Promedio de numeros positivos: " + promPositives);
        System.out.println("Promedio de numeros negativos: " + promNegatives);
        System.out.println("Cantidad de ceros: " + countZeros);
    }
}

