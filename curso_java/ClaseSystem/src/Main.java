import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Para más informacion buscar System properties JAVA en google
        String userName = System.getProperty("user.name"); // obtener el numbre del usuario actual
        String home = System.getProperty("user.home");
        String workspace = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator"); // separador utilizado por el sistema, depende del sistema operativo utilizado
        String versionJava = System.getProperty("java.version");

        Properties propiedadesCompletasOBJ = System.getProperties(); // creamos un obj de tipo Properties para poder acceder al listado completo de todas las propiedades del sistema

        System.out.println("___________________________");
        propiedadesCompletasOBJ.list(System.out); // imprimimos el listado completo de las propiedades del sistema
        System.out.println("___________________________");

        System.out.println("userName = " + userName);
        System.out.println("home = " + home);
        System.out.println("workspace = " + workspace);
        System.out.println("separador = " + separador);
        System.out.println("versionJava = " + versionJava);

        // al leer el archivo de configuracion se pide de forma OBLIGATORIA hacer uso de try catch
        try {
            /* obteniendo las propiedades del archivo de configuracion creado = archivoConfiguracion.properties */

            FileInputStream archivoConfiguracion = new FileInputStream("src/archivoConfiguracion.properties"); // referencia al archivo de configuracion .properties
            Properties nuevasPropiedadesOBJ = new Properties(System.getProperties()); //nuevo obj de properties
            nuevasPropiedadesOBJ.load(archivoConfiguracion); // cargamos el archivo de configuraciones personalizado
            nuevasPropiedadesOBJ.setProperty("autor.telefono","3223211212"); // agregamos una nueva propiedad personalizada al archivo .properties
            System.setProperties(nuevasPropiedadesOBJ); // agregamos a las propiedades al sistema la info del archivo

            // imprimiendo las propiedades del archivo
            System.out.println("___________________________");

            Properties ps = System.getProperties();
            ps.list(System.out); // imprime el listado completo de propiedades del sistema

            System.out.println("___________________________");
            // obteniendo las propiedades de manera independiente
            System.out.println(ps.getProperty("autor.name"));
            System.out.println(ps.getProperty("autor.apellido"));
            System.out.println(ps.getProperty("autor.telefono"));

        } catch (Exception e) {

            System.out.println("Error al leer el archivo de propiedades");

        }

        // obteniendo contenido de variables de ambiente o entorno (como path, username, temp,  por ejemplo)

        Map<String, String> entorno = new HashMap<String, String>();
        entorno = System.getenv(); // get envyroment

        System.out.println("contenido de la variable de entorno = " + entorno);

        //obteniendo valores individuales
        System.out.println("USERNAME = " + System.getenv("USERNAME"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
        System.out.println("TEMP = " + System.getenv("TEMP"));
        System.out.println("USERNAME desde el MAP: " + entorno.get("USERNAME"));


        // metodos y atributos utiles de la clase SYSTEM
        System.out.println(); // para imprimir mensage de salida
        System.err.println(); // para imprimir errores
        System.exit(0); // con cero indicamos que se termina de forma correcta, con 1 indicamos que se lanza una excepcion
        System.gc(); // invocando al garbage collector de manera explicita. NOTA: la maquina virtual de java lo invoca automaticamente cuando se requiere.


    }
}