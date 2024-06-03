import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // variables por referencia u objetos usan clases WRAPPER (ej: Integer, Float, Double, etc...)
        Integer numero1 = 0;
        Float numero2 = 3.4f;
        Double numero3 = 3.4;
        String texto = "hola mundo";

        // variables literales o primitivas
        int numeroPrim1 = 0;
        float numeroPrim2 = 3.4f;
        double numeroPrim3 = 3.4;
        char textoPrim = 'h';

        Class resultado1 = numero1.getClass();
        Class resultado2 = numero2.getClass();
        Class resultado3 = numero3.getClass();
        Class resultadoTexto = texto.getClass();

        System.out.println("resultado1 = " + resultado1);
        System.out.println("resultado2 = " + resultado2);
        System.out.println("resultado3 = " + resultado3);
        System.out.println("resultadoTexto = " + resultadoTexto);

        System.out.println("resultado1.getName() = " + resultado1.getName());
        System.out.println("resultado2.getName() = " + resultado2.getName());
        System.out.println("resultado3.getName() = " + resultado3.getName());
        System.out.println("resultadoTexto.getName() = " + resultadoTexto.getName());

        System.out.println("resultado1.getSimpleName() = " + resultado1.getSimpleName());
        System.out.println("resultado2.getSimpleName() = " + resultado2.getSimpleName());
        System.out.println("resultado3.getSimpleName() = " + resultado3.getSimpleName());
        System.out.println("resultadoTexto.getName() = " + resultadoTexto.getSimpleName());

        System.out.println("\nImprimiendo metodos de resultado1: ");
        for (Method metodo: resultado1.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        System.out.println("\nImprimiendo metodos de resultado2: ");
        for (Method metodo: resultado2.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        System.out.println("\nImprimiendo metodos de resultado3: ");
        for (Method metodo: resultado3.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        System.out.println("\nImprimiendo metodos de resultadoTexto: ");
        for (Method metodo: resultadoTexto.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }
    }
}