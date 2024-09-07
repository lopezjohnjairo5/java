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


        // metodos importantes listas
        System.out.println("tamanno lista: " + list.size()); // muestra el tamaño de la lista
        System.out.println("verificar si esta vacia: " + list.isEmpty()); // muestra si esta vacia o no
        list.add(0,"uno"); // agrega un nuevo valor en la posicion indicada por parametro
        list.add(1,"dos");
        list.add(2,"tres");
        list.add(3,"cuatro");
        list.add(4,"seis");
        list.add(4,"cinco"); // agregamos el cinco en la posicion que tenia el 6, de esta forma el seis se corre una posicion
        list.remove(0); // remueve el elemento presente en el indice pasado por parametro
        System.out.println("list = " + list);

        System.out.println("Existe el cuatro: " + list.contains("cuatro")); // verificamos si existe el valor pasado por parametro en la lista

        // LinkedList
        LinkedList<String> numerosRomanos = new LinkedList<>();
        numerosRomanos.add("II");
        numerosRomanos.add("III");
        numerosRomanos.add("IV");
        numerosRomanos.add("V");
        numerosRomanos.add("VI");
        numerosRomanos.add("VII");
        numerosRomanos.add("VIII");
        numerosRomanos.add("IX");

        // añadiendo valores al principio y al final
        numerosRomanos.addFirst("I");
        numerosRomanos.addLast("X");

        // obteniendo valores de la lista enlazada
        System.out.println("cuarto valor (indice 3): " + numerosRomanos.get(3));

        // removiendo valores de la lista enlazada
        System.out.println("contenido lista enlazada antes de remover valores: " + numerosRomanos);
        numerosRomanos.removeFirst();
        numerosRomanos.removeLast();
        numerosRomanos.remove(5);
        numerosRomanos.add(5,"Hola");
        System.out.println("contenido lista enlazada: " + numerosRomanos);

        // trabajando con listiterator
        ListIterator<String> romanos = numerosRomanos.listIterator();

        System.out.println("\nIterando romanos");
        while(romanos.hasNext()){
            String num = romanos.next();
            System.out.println("num = " + num);
        }

        System.out.println("\nIterando romanos en reversa");
        while(romanos.hasPrevious()){
            String num = romanos.previous();
            System.out.println("num = " + num);
        }
    }
}