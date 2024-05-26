import java.util.Scanner;

// creado por JJL
// 25-05-2024
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // vars
        int menor = 0, actual, cantidad;
        String mensaje = "";

        Scanner scaner = new Scanner(System.in);

        try {
            System.out.println("\nA continuacion podrá introducir los numeros enteros que desee y el programa le dirá cual es el número menor  introducido.\n");
            System.out.println("\nCuantos numeros desea ingresar?");
            cantidad = scaner.nextInt();

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Introduzca un numero entero: ");
                actual = scaner.nextInt();

                menor = menor == 0 || menor > actual ? actual : menor;
            }

            mensaje = menor == 10 ? "\"El menor número introducido: " + menor + " es igual que 10!\"" : menor < 10 ? "\"El menor número introducido: " + menor + " es menor que 10!\"": "El menor número introducido es: " + menor;
            System.out.println(mensaje);

        } catch (Exception e) {
            System.out.println("Error al ingresar los números. Solo se reciben valores de tipo entero.");
            main(args);
            System.exit(0);
        }

    }
}