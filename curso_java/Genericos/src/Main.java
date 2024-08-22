import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Sintaxis clases =  alcance class NombreClase <atributoMetodoGenerico> || public class MiClaseGenerica <T>
    Sintaxis metodo = alcance tipo <atributoMetodoGenerico> retorno nombreMetodo (TipoParametro <atributoMetodoGenerico> nombreAtributo, ... ) || public static <T> List returnListOfItems (T a, T b, T c){

    NOTA:
        - en los metodos genericos tanto los parametros como el retorno son opcionales, depende de si se desea que se tenga o no tanto parametros y/o retorno
        por lo cual la sintaxis anterior es algo general, mas no es definitiva

    * las clases y metodos genericos son un mecanismo mediante el cual
    * se puede extender o limitar el tipo de elementos/objetos que se reciben
    * para trabajar, evitando de esta forma tener que hacer conversiones de tipos (cast)
    * al momento de trabajar. EJ:
    * - si tenemos 3 listas, una de Strings, otra de Integers y otra de objetos y
    * queremos mostrar el contenido de estas, tendriamos que hacer una conversion (a OBJ ) antes de
    * intentar imprimirlas o deberiamos crear un metodo de impresion para cada una de estas
    * listas. Si decidimos hacer uso de los metodos o clases generic@s, no seria necesario tener
    * un metodo para cada uno, ni tampoco hacer cast en cada una de las listas.
    *
    * Caracteristicas
    * - las clases genericas llevarán las llaves triangulares <T> despues del nombre de la clase
    * - el Parametro "T" se pone por convencion, puede ser otro valor, pero si debe estar presente
    * - en los metodos el valor <T> debe ir antes del retorno en caso que se desee retornar algo
    * - en los metodos: si se requiere que se pase un parametro general, se debe poner el tipo a recibir seguido de"<T>", ej: List<T> lista
    * - Existe el wildcard o comodin para los metodos, este indica que se va a pasar un parametro que no se sabe exactamente de que tipo es, pero, si se sabe que debe extender o heredar de un tipo
    *       especifico. EJ: List< ? extends Number> listaNumeros == indica que se espera que se pase una lista que contendrá numeros (no se sabe si son enteros, flotantes, doubles, etc...), pero si que son numeros
     * - paar el caso del wildcard, este se puede usar en los parametros de los metodos y sirve como un limitante de tipos, es decir, sirve para indicar que tipos de datos se pueden recibir.
     *
     *
     * */
    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        letras.add("a");
        letras.add("e");
        letras.add("i");
        letras.add("o");
        letras.add("u");

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        MiClaseGenerica imprimir = new MiClaseGenerica();
        imprimir.printContentList(letras);
        imprimir.printContentList(numeros);

        miMetodo(numeros);

        // creando listas de valores de diferentes tipos
        System.out.println(returnListOfItems ("Hola", "mundo", "desde")); // lista de strings
        System.out.println(returnListOfItems (1,3,5)); // lista de ints
        System.out.println(returnListOfItems (1.2,3.5,6.8)); // lista de doubles
        System.out.println(returnListOfItems (1.3F,7.5F,3.8F)); // lista de floats
        System.out.println(returnListOfItems (2L,5L,8L)); // lista de Longs

    }

    public static <T> void miMetodo (List <? extends Number> num){
        /*
        * metodo encargado de imprimir los numeros de una lista pasada por parametro
        * <? extends Number> ó wildcard o comodin, es una limitacion al parametro que
        * impide que se pase una lista (en este caso) cuyo contenido sea diferente a un Numero(int, float, double, etc)
        * */
        for (Number n: num){
            System.out.println("n = " + n);
        }
    }

    public static <T> List returnListOfItems (T a, T b, T c){
        /*
        * metodo general encargado de crear una lista con los valores pasados por parametro
        * Sirve para crear tanto listas de numeros, como de strings, etc...
        * */
        List<String> msn = new ArrayList<>();
        msn.add("Error");

        if (a instanceof String){
            String[] lista = new String[3];
            lista[0] = (String)a;
            lista[1] = (String)b;
            lista[2] = (String)c;
            return List.of(lista);
        }
        else if (a instanceof Number){
            Number[] lista = new Number[3];
            lista[0] = (Number)a;
            lista[1] = (Number)b;
            lista[2] = (Number)c;
            return List.of(lista);
        }

        return msn;
    }
}