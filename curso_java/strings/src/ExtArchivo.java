public class ExtArchivo {
    public static void main(String[] args){
        String archivo = "miarchivo.jpg";
        String[] arrayString = archivo.split("\\."); // se utiliza doble barra debido a que el . solo es tomado como caracter de expresion regular
        System.out.println("archivo.length() = " + archivo.length());


        // formas de obtener la extension de un archivo
        System.out.println("extension del archivo = " + archivo.substring(archivo.length()-4)); // si la extension no tiene 4 caracteres incluyendo el punto, fallaria
        System.out.println("extension del archivo = " + archivo.substring(archivo.indexOf("."))); // si el nombre tiene mas de un . no funcionaria
        System.out.println("extension del archivo = " + archivo.substring(archivo.lastIndexOf(".")));
        System.out.println("extension del archivo (mediante split) = " + arrayString[arrayString.length - 1]);
    }
}
