import java.util.Scanner;
/*
 * creado por JJL
 * 17/06/2024
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int lenValues = 0;

        System.out.print("Que tamaño desea para la matriz de X: ");
        try {
            lenValues = scaner.nextInt();
            if (lenValues <= 0){
                throw new Exception();
            }
            String[][] miMatriz = createMatrizH(lenValues);
            printMatriz(miMatriz);

        } catch (Exception e) {
            System.out.println("Debe ingresar un numero entero (sin decimales) mayor a cero. Verifique e intente nuevamente.\n");
            main(args);
            System.exit(0);
        }
    }

    public static String[][] createMatrizH(int lenValues){

        String[][] matrizDX = new String[lenValues][lenValues];
        int half = (int)(matrizDX.length / 2);

        for (int i = 0; i < lenValues; i++) {
            for (int j = 0; j < lenValues; j++) {
                if ((j == 0 )|| i == half || (i >= half && j == lenValues-1)){
                    matrizDX[i][j] = "1";
                } else {
                    matrizDX[i][j] = "0";
                }
            }
        }

        return matrizDX;
    }

    public static void printMatriz(String[][] miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print(miMatriz[i][j]);
            }
            System.out.println();
        }
    }
}