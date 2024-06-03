import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        /*
        * metodo encargado de leer un archivo de
        * configuracion personalizado y asignarlo a las
        * configuraciones del sistema.
        * */
        try{
            FileInputStream miArchivoConfiguracion = new FileInputStream("src/config.properties"); // OBJ de carga del archivo
            Properties configuracionOBJ = System.getProperties(); // OBJ de propiedades del archivo de configuracion
            configuracionOBJ.load(miArchivoConfiguracion); // cargando archivo de configuracion del sistema

            System.setProperties(configuracionOBJ); // asignando configuracion personalizada a las configuraciones del sistema
            configuracionOBJ.list(System.out); // imprimiendo listado completo de propiedades del SISTEMA

            System.out.println(configuracionOBJ.getProperty("autor.nombre")); // imprimiendo una de las propiedades personalizadas
        }catch (Exception e){
            System.out.println("Problema al leer el archivo.");
        }
    }
}