import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Los bucles de control son herramientas
        * que permiten iterar o repetir  porciones de codigo
        * siempre y cuando se cumpla la condicion establecida
        * */
        // variables | arrays a utilizar
        char[] vocales = {'a','e','i','o','u'};
        String[] palabras = {"hola", "mundo", "que", "tal", "estan"};
        int[] numerosEnteros = {1,2,3,4,5,6,7,8,9,0};

        int count = 0;

        // do while
        iterarArrayConDoWhile(vocales);

        // while
        iterarArrayConWhile(palabras);

        // for -- mas rapido que hacer uso de while
        iterarArrayConFor(numerosEnteros);

        // foreach -- solo para arrays
        mostrarContenidoConForeach(numerosEnteros);

        // for con etiquetas (las etiquetas son un marcador de posicion al cual podemos acceder mediante el nombre, esto permite cambiar el orden de ejecucion de la aplicacion)
        iterarArrayConForConEtiquetas(palabras);


        // while con etiquetas
        iterarArrayConWhileCOnEtiquetas(palabras);

        // creando y mostrando MAP array
        Map<Integer,String> miMap =  createHashMap(palabras);
        mostrarContenidoMap(miMap);
    }

    public static Map createHashMap( String[] miArray ){
        Map<Integer, String> diccionarioSimbolos = new HashMap<Integer, String>();
        int lengthMiArray = miArray.length;
        for (int i = 0; i < lengthMiArray; i++) {
            diccionarioSimbolos.put(i,miArray[i]);
        }
       return diccionarioSimbolos;
    }
    
    public static void mostrarContenidoMap(Map<Integer, String> miMap){
        System.out.println("Mostrando el contenido de miMap: ");
        int lengthMap = miMap.size();
        for (int i = 0; i < lengthMap; i++) {
            System.out.println(Integer.toString(i) + " " + miMap.get(i));
        }

        // imprimimos todos los valores del Map
        System.out.println(miMap.containsKey(2)); // verifica si el map contiene la clave pasada por parametro
        System.out.println(miMap.containsValue("mundo")); // verifica si el map contiene el valor pasado por parametro
        System.out.println(miMap.values());
    }

    public static void iterarArrayConDoWhile(char[] miArray){
        int count = 0;
        int lengthArray = miArray.length;
        System.out.println("Mostrando contenido array con do while:");
        do {
            System.out.println(miArray[count]);
            count++;
        } while (count < lengthArray);
    }

    public static void iterarArrayConWhile(String[] miArray){
        int count = 0;
        int lengthArray = miArray.length;
        System.out.println("Mostrando contenido array con while:");
        while (count < lengthArray){
            System.out.println(miArray[count]);
            count++;
        }
    }
    public static void iterarArrayConFor(int[] miArray){
        System.out.println("Mostrando contenido array con for:");
        int lengthArray = miArray.length;
        for (int i = 0; i < lengthArray; i++) {
            System.out.println(miArray[i]);
        }
    }

    public static void mostrarContenidoConForeach( int[] miArrayNumerico){
        System.out.println("Mostrando el contenido de un array mediante foreach");
        for(int num: miArrayNumerico){ // num, es el tipo de dato que tiene el array que se iterará, podria ser tambien String en caso de recorrer el array alfabeto o vocales
            System.out.println("num = " + num);
        }
    }

    public static void iterarArrayConForConEtiquetas(String[] miArray){
        String value;
        int arrayLength =miArray.length;

        System.out.println("Imprimiendo el contenido de un array mediante un FOR con etiquetas");

        etiqueta:
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < 5; j++) {
                value = miArray[i];
                if ("que".equals(value)){
                    continue etiqueta; // llama al for padre directamente, saltandose el SOUT de miarray que viene abajo
                } else if ("tal".equals(value)){
                    break etiqueta; // termina la ejecucion del for padre, no muestra nada mas
                }

                System.out.println("miArray[i] = " + miArray[i]);
            }
        }
    }

    public static void iterarArrayConWhileCOnEtiquetas(String[] miArray){
        Boolean continuar = true;
        int posicion = 0, contadorInterno = 0 ;


        System.out.println("Imprimiendo el contenido de un array mediante un WHILE con etiqueta:");

        // etiqueta en el WHILE
        etiquetaWhile:
        while (continuar) {
            contadorInterno = 0;
            while (contadorInterno < 5){
                if (posicion == 3){
                    posicion++;
                    continue etiquetaWhile; // si estamos en la posicion 3 del array llamamos el while padre y nos saltamos el bucle actual
                } else if (posicion == 5) {
                    break etiquetaWhile; // si estamos en la posicion 5 del array finalizamos el bucle padre y no se ejecuta nada mas
                }
                System.out.println(" - " + miArray[posicion]);
                contadorInterno++;
            }
            posicion++;
        }

    }

}