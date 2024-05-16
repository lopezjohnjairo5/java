public class Validar {

    public static void main(String[] args){
        String curso = null;
        boolean esNulo = curso == null; // comprobando valor con nulo

        System.out.println("esNulo = " + esNulo);

        // verificando mediante el uso de un condicional
        if (esNulo) {
            curso = "programacion JAVA";
        }

        // formas de evaluar vacio
        boolean longitudCero = curso.length() == 0; // si su longitud es mayor a cero entonces no esta vacio
        boolean esVacio = curso.isEmpty(); // verifica solo si esta vacio
        boolean estaBlanco = curso.isBlank(); // verifica si esta vacio o si tiene solo un espacio o equivalente

        // no es necesario validar los 3, pero, se hace para fines del ejercicio
        if (!longitudCero && !esVacio && !estaBlanco){
            System.out.println("Bienvenidos al curso: " + curso);
        }
    }
}
