//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // constantes de Math
        double valorPI = Math.PI;
        double constanteE = Math.E;

        // metodos y funciones utiles de la clase Math
        int valorAbsoluto = Math.abs(-54); // obtiene el valor absoluto del elemento pasado por parametro.
        int valorMaximo = Math.max(12, 34); // retorna el valor maximo entre los pasados por parametro, recibe valores de tipos: entero, long, float, double, entre otros
        int valorMinimo = Math.min(12, 34); // retorna el valor minimo entre los pasados por parametro, recibe valores de tipos: entero, long, float, double, entre otros
        double redondeoSuperior = Math.ceil(3.5); // redondea al entero superior
        double redondeoInferior = Math.floor(3.5); // redondea al entero inferior
        long redondeo = Math.round(4.6); // redondea al entero mas cercano, puede ser superior o inferior. Retorna un valor LONG
        double elevarExponente = Math.exp(4.6); // recibe el valor de elevacion y se lo aplica a la constante de euler.
        double logaritmoNatural = Math.log(10); // retorna el valor del logaritmo natural del valor pasado por parametro
        double potencia = Math.pow(3, 2); // eleva un valor a otro y retorna el resutlado, ej: 3^2
        double raiz = Math.sqrt(89); // raiz cuadrada del valor pasado por parametro

        double convertirAGrados = Math.toDegrees(25);
        double convertirARadiantes = Math.toRadians(25);

        double seno90 = Math.sin(90);
        double coseno90 = Math.cos(90);
        double tang90 = Math.tan(90);

        double aleatorio = Math.random(); // crea valor aleatorio entre 0 y 1(no incluido)

        // imprimimos 100 numeros aleatorios enteros entre 1 y 10, ambos incluidos
        for (int i = 0; i < 100; i++) {
            int aleatorioInt = (int) (Math.random() * 10) + 1; // valor aleatorio entre 1 y 10(no incluido)
            System.out.println("aleatorioInt = " + aleatorioInt);
        }
    }

}