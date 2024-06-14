import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*
        * matrices
        * */

        int[][] matrizSimplificada = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,13,14}
        };

        String[][] meses = new String[6][2]; // Type[filas][columnas]
        Integer[][] numeros = new Integer[4][4];
        char[][] abcdario = new char[2][13];
        int[][] matrizTamañoVariable = new int[2][];

        // tamanno variable - se define en cada fila un tamaño diferente y despues se pueden agregar los valores comun y corriente
        matrizTamañoVariable[0] = new int[3];
        matrizTamañoVariable[1] = new int[56];

        System.out.println("\n\nmatrizTamañoVariable - tamanno en fila [0] = " + matrizTamañoVariable[0].length);
        System.out.println("matrizTamañoVariable - tamanno en fila [1] = " + matrizTamañoVariable[1].length);

        // llenando las matrices
        // uno a uno
        meses[0][0] = "Enero";
        meses[0][1] = "Febrero";
        meses[1][0] = "Marzo";
        meses[1][1] = "Abril";
        meses[2][0] = "Mayo";
        meses[2][1] = "Junio";
        meses[3][0] = "Julio";
        meses[3][1] = "Agosto";
        meses[4][0] = "Septiembre";
        meses[4][1] = "Octubre";
        meses[5][0] = "Noviembre";
        meses[5][1] = "Diciembre";

        // llenando matriz por ciclo
        numeros = (Integer[][])fillMatriz(numeros); // se hace cast porque retorna Object[][]
        abcdario = fillMatrizChar(abcdario);

        // imprimiendo el contenido de las matrices
        printMatriz(meses);
        printMatriz(numeros);
        printMatrizChar(abcdario);

        // buscando valor en las matrices
        searchValueMatriz(meses, "Septiembre");
    }

    public static int searchValueMatriz(String[][] miMatriz, String elementSearch) {
        int lenRow = miMatriz.length;
        int lenColumn = miMatriz[0].length;

        for (int i = 0; i < lenRow; i++) {
            for (int j = 0; j < lenColumn; j++) {
                if (Objects.equals(elementSearch, miMatriz[i][j])){
                    System.out.println("Valor "+elementSearch+" encontrado en la posicion: ["+i+"]["+j+"]");
                    return 1;
                }
            }
        }
        System.out.println("Valor no encontrado");
        return 0;
    }

    public static void printMatriz(Object[][] miMatriz){
        System.out.println("\nEl contenido de la matriz es: \n");
        for (Object[] fila: miMatriz){
            for (Object celda: fila){
                System.out.println(celda);
            }
        }
    }

    public static void printMatrizChar(char[][] miMatriz){
        System.out.println("\nEl contenido de la matriz es: \n");
        for (char[] fila: miMatriz){
            for (char celda: fila){
                System.out.println(celda);
            }
        }
    }

    public static Object[][] fillMatriz(Object[][] miMatriz){
        int filas = miMatriz.length;
        int columnas = miMatriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                miMatriz[i][j] = i + j;
            }
        }

        return miMatriz;
    }

    public static char[][] fillMatrizChar(char[][] miMatriz){
        int filas = miMatriz.length;
        int columnas = miMatriz[0].length;
        int inicioL = 97;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                miMatriz[i][j] = (char) inicioL++;
            }
        }

        return miMatriz;
    }
}