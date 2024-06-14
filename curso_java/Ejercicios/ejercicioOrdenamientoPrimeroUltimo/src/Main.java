import java.util.Scanner;

/*
* Credo por:  JJL
* 11/06/2024
* */
public class Main {
    public static void main(String[] args) {
    /*
    * Leer 10 números enteros desde el teclado para
    * llenar un arreglo de 10 elementos. Luego debemos
    * mostrarlos en el siguiente orden: el último, el
    * primero,
    * el penúltimo, el segundo, el antepenúltimo, el
    * tercero, y así sucesivamente.
    * */
        Scanner scaner = new Scanner(System.in);
        int[] arrayNumerosEnteros = new int[10];
        int[] arrayNumerosEnterosReordenado = new int[10];
        int tamannoArray = arrayNumerosEnteros.length, incremento = 0, decremento = tamannoArray-1;

        // llenamos el array de numeros enteros ingresados por teclado
        for (int i = 0; i < tamannoArray; i++) {
            System.out.print("Introduzca un número entero: ");
            arrayNumerosEnteros[i] = scaner.nextInt();
        }

        // realizamos el ordenamiento solicitado
        for (int i = 0; i < tamannoArray; i+=2) { // al incrementar en 2 unidades cada ciclo, seria como iterar hasta la mitad del tamanno del array
            arrayNumerosEnterosReordenado[i] = arrayNumerosEnteros[incremento];
            arrayNumerosEnterosReordenado[i+1] = arrayNumerosEnteros[decremento];
            decremento--;
            incremento++;
        }

        // imprimimos los arrays
        printArrayContent(arrayNumerosEnteros,"Numeros enteros ingresados\n");
        printArrayContent(arrayNumerosEnterosReordenado,"Numeros reordenados\n");


    }

    public static void printArrayContent(int[] arrayNumeros, String msg){
        System.out.println("\nArray: " + msg);
        int tamannoArray = arrayNumeros.length;
        for (int i = 0; i < tamannoArray; i++) {
            System.out.println("pos"+i+" : "+arrayNumeros[i]);
        }
    }
}