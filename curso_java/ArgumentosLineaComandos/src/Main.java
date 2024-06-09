public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumentos n " + i + ":" + args[i]);
            }
        } else {
            System.out.println("Se requieren argumentos. Verifique e intente nuevamente.");
            System.exit(-1); // -1 indica error
        }


        /*
        pasos para compilar desde terminal y generar el bytecode o archivo.class
        * - Nos ubicamos en la carpeta src
        * - invocamos el compilador de java con el comando JAVAC, seguido del archivo principal Main.java (en este caso)
        * - una vez creado el archivo.class, podemos ejecutarlo mediante el comando JAVA nombre del archivo class(sin extension) param1 param2
        * - ej de ejecucion de este mismo archivo (Sin argumentos arrojará el mensaje: "Se requieren argumentos. Verifique e intente nuevamente."):
            > javac Main.java -encoding utf8 (el -encoding utf8 es opcional e indica el tipo de codificacion de esta manera recibirá acentos)
            > java Main jorge patricia jose john jairo carlos "javier mauricio"
            > resultado:
            Argumentos n 0:jorge
            Argumentos n 1:patricia
            Argumentos n 2:jose
            Argumentos n 3:john
            Argumentos n 4:jairo
            Argumentos n 5:carlos
            Argumentos n 6:javier mauricio

          - NOTAS:
            - al crear el .class este quedará en la misma carpeta del .java
            - al ejecutar el archivo: cuando se pasan arcgumentos que contienen espacios, deben ir entre comillas dobles
            - se debe invocar a JAVAC cada vez que se realizen cambios en el codigo de los archivos.
            - si se quiere que el .class salga en otra carpeta nos ubicamos primero en la carpeta destino (mediante cd en terminal) y luego compilamos comun y corriente
        */

    }
}