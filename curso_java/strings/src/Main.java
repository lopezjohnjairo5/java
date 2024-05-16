
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Notas:
        * - los strings son inmutables, esto quiere decir que una vez declarados con un valor,
        *   este no cambiará, aunque parezca que si, realmente lo que pasará
        *   al asignar un nuevo valor a un string es que se retornará un nuevo obj String
        *   con el valor asignado.
        * */
        String mensaje = " hola mundo ";
        String nombre = "John"; // forma literal
        String nombre2 = new String("JOHN"); // declaracion mediante OBJ
        String apellido = "López";
        String sinContenido = "";
        String conEspacio = " ";
        char[] arrayMensaje = mensaje.toCharArray();

        System.out.println("mensaje = " + mensaje);
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);

        System.out.println("los nombres son iguales: "+ (nombre == nombre2)); // compara tipo, no contenido
        System.out.println("los nombres son iguales: "+ (nombre.equals(nombre2))); // compara el contenido de los 2 strings
        System.out.println("los nombres son iguales: "+ (nombre.equalsIgnoreCase(nombre2))); // compara el contenido de los 2 strings sin importar si hay o no mayusculas

        // metodos para trabajar con strings

        System.out.println("longitud del nombre: " + (nombre.length()));
        System.out.println("quita el espacio al inicio y al final del string: " + (mensaje.trim()));
        System.out.println("extrae un caracter de la posicion indicada: " + (mensaje.charAt(2)));
        System.out.println("extrae una porcion de la cadena: " + (mensaje.substring(2,5)) );

        System.out.println("convierte la cadena en un arreglo de caracteres: ");
        System.out.println(arrayMensaje[0] + arrayMensaje[1]);

        System.out.println("indica en que posicion se encuentra un caracter: " + (mensaje.indexOf("a")));
        System.out.println("verifica si la cadena comienza con el caracter especificado: " + (mensaje.trim().startsWith("h")));
        System.out.println("verifica si la cadena finaliza con el caracter especificado: " + (mensaje.trim().endsWith("o")));
        System.out.println("divide la cadena en partes segun el patron especificado: " + mensaje.split(" ")[0] + mensaje.split(" ")[1]);

        System.out.println("concatenacion: " + nombre + apellido);
        System.out.println("concatenacion elementos array: " + arrayMensaje[0] + arrayMensaje[1]);
        System.out.println("Concatenando con concat: " + nombre2.concat(apellido));

        // modificando el contenido del mensaje STRING
        String resultado1 = mensaje.replace("o", "0");

        System.out.println("resultado1 = " + resultado1);
        
        // ejemplo array strings | char
        System.out.println("arrayMensaje: ");
        for (int i = 0; i < arrayMensaje.length; i++) {
            System.out.println("Pos " + i + " - " + arrayMensaje[i]);
        }

        // validando contenido de strings
        System.out.println("sinContenido = " + sinContenido.isEmpty()); // verifica si el string tiene o no contenido
        System.out.println("conEspacio = " + conEspacio.isBlank()); // verifica si el string tiene o no contenido y si el contenido es un espaio o similar
    }
}