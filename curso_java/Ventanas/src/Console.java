import java.util.Scanner;

public class Console {
    public static void main(String[] args){
        // obj tipo escaner para leer y operar con los datos escritos en terminal
        Scanner scanner = new Scanner(System.in); // requiere import java.util.Scanner;
                                                    // System.in hace referencia a que espere la
                                                    // introduccion de valores mediante la terminal,
                                                    // ¿de dónde vienen la fuente de datos?
                                                    // tambien se puede usar un objeto de clase File
                                                    // si queremos leer la entrada de un archivo
        System.out.println("Ingrese un número entero: ");
        String valueFromTerminal = scanner.nextLine();
        int numDecimal = 0;
        try{
            numDecimal = Integer.parseInt(valueFromTerminal); // convertimos el valor a un entero valido
            //numDecimal = scanner.nextInt(); // convertimos el valor a un entero valido, se queda pensando...
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("El número ingresado es: "+ numDecimal);

        /*
        * Informacion adicional de Scanner
        *
        * Método + Explicación

        boolean nextBoolean() = Lee valores lógicos boléanos introducidos por el usuario.

        byte nextByte() = Lee valores byte introducidos por el usuario.

        double nextDouble() =  Lee valores double introducidos por el usuario.

        float nextFloat() = Lee valores float introducidos por el usuario.

        int nextInt() =  Lee valores int introducidos por el usuario.

        String nextLine() = Lee valores String introducidos por el usuario.

        long nextLong() =  Lee valores long introducidos por el usuario.

        short nextShort() = Lee valores short introducidos por el usuario.

       * Metodos adicionales
       *
       *
        Método + Explicación

        hasNextBoolean() = Devuelve true si el siguiente valor es introducido es un booleano.

        hasNextByte() = Devuelve true si el siguiente valor es introducido es un valor byte.

        hasNextDouble() = Devuelve true si el siguiente valor es introducido es un valor double.

        hasNextFloat() = Devuelve true si el siguiente valor es introducido es un valor float.

        hasNextInt() = Devuelve true si el siguiente valor es introducido es un valor int.

        hasNextLong() = Devuelve true si el siguiente valor es introducido es un valor long.

        boolean hasNextShort() = Returns true if the next value entered by the user is a valid short value.
        *
        * Ejemplo de uso
        *
        * // Declarar un objeto e inicializar con
        // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);
        // Inicializar la suma y el recuento
        // de los elementos de entrada
        int sum = 0, count = 0;
        // Compruebe si un valor int está disponible
        while (sc.hasNextInt())
        {
            // Lee un valor int
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("La media es: " + mean);
        * */
    }
}
