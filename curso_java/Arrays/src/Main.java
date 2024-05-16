//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palabraLarga = "esternocleidomastoideo";
        char[] miarray = palabraLarga.toCharArray(); // retorna un array de palabraLarga de tipo char
        String[] miarray2 = palabraLarga.split("e"); // creamos un array dividiendo la cadena en porciones

        viewContentArrayChar(miarray); // mostrando contenido del array CHAR

        viewContentArrayString(miarray2); // mostrando contenido del array STRING

    }

    public static void viewContentArrayChar(char[] args){
        // mostrando el contenido del Array
        System.out.println("Array:\n");
        int longitudArray = args.length;
        for (int i = 0; i < longitudArray; i++) {
            System.out.println((i + 1) + " - " + args[i]);
        }
    }

    public static void viewContentArrayString(String[] args){
        // mostrando el contenido del Array
        System.out.println("Array:\n");
        int longitudArray = args.length;
        for (int i = 0; i < longitudArray; i++) {
            System.out.println((i + 1) + " - " + args[i]);
        }
    }
}