import static co.johnlopez.OtraClaseConMetodoEstatico.saludo;
import co.johnlopez.OtraClaseEjemplo; // importando clases de un paquete (package)
import co.johnlopez.proyectox.Contabilidad; // dominio.empresa.proyecto.rama(seccion,modulo,etc...)

public class Main {
    public static void main(String[] args) {
        OtraClaseEjemplo nuevo = new OtraClaseEjemplo("John","López");
        String saludoMetodoEstatico = saludo(); // metodo estatico invocado desde OtraClaseConMetodoEstatico
        Contabilidad contabilidad =  new Contabilidad(); // objeto para invocacion de metodo de subpaquete proyectox
        String saludoContabilidad = contabilidad.getMensaje();

        System.out.println("\nnuevo = " + nuevo);
        System.out.println("\ncontabilidad = " + saludoContabilidad);
        System.out.println(saludoMetodoEstatico);
        System.out.println("\nLos paquetes (package) en JAVA, son formas de agrupar|ordenar el codigo(clases). Basicamente" +
                "Un paquete vendria siendo una carpeta que incluye archivos de clases y/u otras subcarpetas, todas que pertenecen a un" +
                "mismo proyecto JAVA. El uso de paquetes tiene varias ventajas:" +
                "\n- permite tener varias clases con los mismos nombres, siempre y cuando esten en paquetes diferentes" +
                "\n- permite ordenar el codigo en secciones lo que hace que a largo plazo sea mas facil mantener el codigo" +
                "\n- permite hacer importaciones de las clases y metodos de manera general o especifica segun se requiera." +
                "\n para hacer uso de los paquetes se hace lo siguiente:" +
                "\n- se crea en SRC un package con click derecho crear nuevo paquete " +
                "\n- se pone el nombre de la organizacion empezando con el dominio seguido del nombre de proyecto, ej: co.miempresa.proyectox" +
                "\n- si se desea tener subcarpetas o subpaquetes, se hace el mismo procedimiento anterior, pero, dentro de los paquetes anteriormente creados" +
                "\n- dentro de las clases que pertenecen a los paquetes se debe poner inicialmente package co.miempresa; para indicar que esa clase pertenece a ese paquete" +
                "\n- para usar el paquete en otras clases se debe importar el mismo, para esto se puede hacer la importacion general (import co.miempresa.*) ó se puede hacer de forma especifica (import co.miempresa.contabilidad) " +
                "\n- las clases, metodos o atributos que no estan marcadas como public, private, etc... tienen el estado default y este impide que sean accesibles desde fuera del PAQUETE al cual pertenecen." +
                "\nPor convencion se nombran los paquetes en MINUSCULA y se usa como separacion entre dominio, paquetes y subpaquetes el punto(.)" +
                "\n\nComo ejemplo general de uso se pueden ver las clases que acompañan a este archivo");

    }
}