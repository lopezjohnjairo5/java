import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
* LIST = son listas similares a los arrays, son ordenadas por defecto y permiten duplicados
* SET = son conjuntos, no permiten elementos repetidos
* - HashSet = no es ordenado
* - TreeSet = si es ordenado por defecto
* */
public class Main {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(); // no esta ordenado por defecto
        TreeSet<Integer> ts = new TreeSet<>(); // si esta ordenado por defecto, mas lento que el hashset

        // añadiendo valores al HashSet
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        boolean result = hs.add("tres"); // comprobando que no se puede incluir un nuevo valor repetido

        // creando lista
        List<String> list = new ArrayList<>(hs); // convirtiendo el hashset en lista
        list.add("tres"); // agregando valor repetido en la lista
        list.add("cinco"); // agregando valor repetido en la lista
        list.add("cinco"); // agregando valor repetido en la lista
        Collections.sort(list); // ordenando ALFABETICAMENTE el contenido de la lista

        hs.add("seis");

        // agregando valores al treeset
        ts.add(1);
        ts.add(4);
        ts.add(5);
        ts.add(2);
        ts.add(3);

        // removiendo valores del hashset y de la lista
        hs.removeAll(list); // elimina todas las ocurrencias del valor pasado por parametro, recibe una lista con los valores a eliminar
        hs.remove("seis"); // elimina la primera ocurrencia del valor pasado por parametro
        list.removeAll(list); // elimina todas las ocurrencias del valor pasado por parametro, recibe una lista con los valores a eliminar
        list.remove("cinco"); // elimina la primera ocurrencia del valor pasado por parametro

        // imprimiento HashSet
        System.out.println("hs = " + hs);
        System.out.println("HashSet permite elementos duplicados: " + result);

        // imprimiento lista
        System.out.println("list = " + list);

        // imprimiento treeset
        System.out.println("ts = " + ts);
    }
}