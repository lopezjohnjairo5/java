public class MetodosString {
    public static void main(String[] args){
        String nombre = "John Jairo";
        String apellido = "López";
        String alfabeto = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String palabraLarga = "esternocleidomastoideo";

        System.out.println("longitud string = " + nombre.length()); // tamanno del string
        System.out.println("mayusculas string = " + nombre.toUpperCase()); // convierte el string a mayusculas
        System.out.println("minusculas string = " + nombre.toLowerCase()); // convierte el string a minusculas
        System.out.println("comparacion de strings (nombre y apellido) = " + nombre.equals(apellido)); // compara el contenido de nombre con el de apellido
        System.out.println("comparacion de strings mediante unicode orden lexicografico (nombre y apellido) = " + nombre.compareTo(apellido));  // compara el contenido de nombre con el de apellido basandose en unicode "comparacion lexicografica"
        System.out.println("obtener un caracter del string (h del nombre John) = " + nombre.charAt(2)); // obtiene un caracter del string, segun la posicion indicada como parametro
        System.out.println("obtener un fragmento del string (Jairo del nombre completo) = " + nombre.substring(5,nombre.length())); // obtiene un fragmento del string. Tiene 2 argumentos aunque el segundo es opcional, el primero indica el inicio y el segundo el final (si este no se pone simplemente toma desde el valor de inicio en adelante)
        System.out.println("reemplazo de caracteres (esternocleidomastoideo por 3st3rnocl3idomastoid3o) = " + palabraLarga.replace("e", "3")); // reemplazo de caracteres dentro de una cadena o string, retorna una nueva cadena con los cambios. NO ALTERA LA ORIGINAL
        System.out.println("retornar la posicion de la primera ocurrencia de un caracter buscado en la cadena o string (M de ABCDEFGHIJKLMNOPQRSTUVWXYZ) = " + alfabeto.indexOf("M")); // retorna la posicion o indice de la primera ocurrencia del caracter buscado en la cadena
        System.out.println("retornar la posicion de la ultima ocurrencia de un caracter buscado en la cadena o string (e de esternocleidomastoideo) = " + palabraLarga.lastIndexOf("e")); // retorna la posicion o indice de la ultima ocurrencia del caracter buscado en la cadena
        System.out.println("(retorna la posicion) indica si existe una secuencia de caracteres dentro de un string (Jai dentro de John Jairo) = " + nombre.contains("Jai")); // retorna la posicion o indice donde comienza la secuencia buscada dentro del string
        System.out.println("verifica si el string correspondiente comienza con la secuencia de caraccteres pasada por parametro (3st3rno en palabraLarga ) = " + palabraLarga.startsWith("3st3rno")); // verifica que el inicio del string tenga la secuencia de caracteres pasada por parametro
        System.out.println("verifica si el string correspondiente finaliza con la secuencia de caraccteres pasada por parametro (deo en palabraLarga) = " + palabraLarga.endsWith("deo")); // verifica que el fin del string tenga la secuencia de caracteres pasada por parametro
        System.out.println("elimina espacios al inicio y al final de la cadena (alfabeto contiene ambos espacios) = " + alfabeto.trim()); // elimina espacios al inicio y al fin de la cadena
    }
}
