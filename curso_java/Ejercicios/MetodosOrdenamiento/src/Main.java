public class Main {
    public static void main(String[] args) {
        Integer[] miArray = {1,3,2,4,5,7,6,8,9,0};
        String[] miArrayString = {"o","a","i","e","u"};

        // Integer
        Integer[] resultBurbleSort = burbleSort(miArray);
        Integer[] resultBurbleSortV2 = burbleSortV2(miArray);

        printArray(resultBurbleSort); // imprimimos el contenido
        printArray(resultBurbleSortV2); // imprimimos el contenido

        // String
        String[] resultBurbleSortS = burbleSortS(miArrayString);
        String[] resultBurbleSortSV2 = burbleSortSV2(miArrayString);

        printArrayS(resultBurbleSortS); // imprimimos el contenido
        printArrayS(resultBurbleSortSV2); // imprimimos el contenido

        // tipos OBJ -- para usar un solo metodo para ordenar tanto Integers como Strings
        Object[] resultBurbleSortOI = burbleSortO(miArray); // array de enteros
        Object[] resultBurbleSortOIV2 = burbleSortO(miArray); // array de enteros
        Object[] resultBurbleSortOS = burbleSortO(miArrayString); // array de strings
        Object[] resultBurbleSortOSV2 = burbleSortOV2(miArrayString); // array de strings

        printArrayO(resultBurbleSortOI); // imprimimos el contenido
        printArrayO(resultBurbleSortOIV2); // imprimimos el contenido
        printArrayO(resultBurbleSortOS); // imprimimos el contenido
        printArrayO(resultBurbleSortOSV2); // imprimimos el contenido

    }
    public static Integer[] burbleSort(Integer[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray; j++) {
                if (miArray[i].compareTo(miArray[j]) < 0){
                    Integer changeVal = miArray[i];
                    miArray[i] = miArray[j];
                    miArray[j] = changeVal;
                }
            }
        }
        
        return miArray;
    }

    public static Integer[] burbleSortV2(Integer[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;
        int count = 0;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray-1; j++) {
                if (miArray[j+1].compareTo(miArray[j]) < 0){
                    Integer changeVal = miArray[i];
                    miArray[i] = miArray[j+1];
                    miArray[j+1] = changeVal;
                }
            }
            count++;
        }

        return miArray;
    }
    
    public static void printArray(Integer[] miArray){
        System.out.println("\n-------------------------\n");
        for (int value: miArray){
            System.out.println("value = " + value);
        }
    }

    // metoodos para String[]

    public static String[] burbleSortS(String[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray; j++) {
                if (miArray[i].compareTo(miArray[j]) < 0){
                    String changeVal = miArray[i];
                    miArray[i] = miArray[j];
                    miArray[j] = changeVal;
                }
            }
        }

        return miArray;
    }

    public static String[] burbleSortSV2(String[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;
        int count = 0;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray-1; j++) {
                if (miArray[j+1].compareTo(miArray[j]) < 0){
                    String changeVal = miArray[i];
                    miArray[i] = miArray[j+1];
                    miArray[j+1] = changeVal;
                }
            }
            count++;
        }

        return miArray;
    }

    public static void printArrayS(String[] miArray){
        System.out.println("\n-------------------------\n");
        for (String value: miArray){
            System.out.println("value = " + value);
        }
    }

    // metodos para To-do tipo de objetos comparables

    public static Object[] burbleSortO(Object[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray; j++) {
                if (((Comparable)miArray[i]).compareTo(miArray[j]) < 0){
                    Object changeVal = miArray[i];
                    miArray[i] = miArray[j];
                    miArray[j] = changeVal;
                }
            }
        }

        return miArray;
    }

    public static Object[] burbleSortOV2(Object[] miArray){
        //Integer[] arraySort = miArray;
        int lenArray = miArray.length;
        int count = 0;

        for (int i = 0; i < lenArray; i++) {
            for (int j = 0; j < lenArray-1; j++) {
                // se debe hacer un casting para que sea un OBJ comparable
                if (((Comparable)miArray[j+1]).compareTo(miArray[j]) < 0){
                    Object changeVal = miArray[i];
                    miArray[i] = miArray[j+1];
                    miArray[j+1] = changeVal;
                }
            }
            count++;
        }

        return miArray;
    }

    public static void printArrayO(Object[] miArray){
        System.out.println("\n-------------------------\n");
        for (Object value: miArray){
            System.out.println("value = " + value);
        }
    }
}