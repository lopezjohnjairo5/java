import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int countTimes = 0;
    // usados para capturar la info por teclado
    static String user;
    static String passw;

    public static void main(String[] args) {

        boolean result = false;

        // incrementamos el numero de intentos realizados
        countTimes++;
        System.out.println("Intento N°".concat(Integer.toString(countTimes)));

        // capturando la info por teclado
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del usuario:\n");
        user = scaner.nextLine();
        System.out.println("Introduzca la contrasenna de acceso:\n");
        passw = scaner.nextLine();

        // si se compara con == da error, debido a que se estan comparando OBJS uno de tipo String y otro resultado de Scanner
        if (countTimes < 3){
            result = verifyUserCredentials(); // verificamos la info introducida con la almacenada
            verifyAccessToPanel(result); // verificamos si podemos o no dar acceso al panel

        } else {
            System.out.println("Informacion incorrecta y numero de intentos excedido. Por favor espere 24 horas antes de intentar nuevamente.");
        }
    }

    public static boolean verifyUserCredentials(){
        // verificamos si el usuario en cuestion tiene las credenciales correctas
        String[] userNames = {"John","Admin"};
        String[] userPassws = {"Q1w2e3r4t5","Admin1234"};

        for (int i = 0; i < userNames.length; i++) {
            //verificando si las claves de acceso del usuario ingreso corresponde con uno de los usuarios almacenados
            if ((user.equals(userNames[i])) && (passw.equals(userPassws[i])) ){
                return true;
            }
        }
        return false;
    }

    public static void verifyAccessToPanel(boolean result){
        // verifica si el valor pasado por parametro es verdadero, en caso afirmativo permitimos acceso al panel admin
        if (result){
            System.out.println("Acceso concedido.\nBienvenido.\n");
        } else {
            System.out.println("Incorrecto, verifique e intente nuevamente.");
            // preguntamos nuevamente
            String[] args = new String[0]; // se declara y definan args ya que no estamos en main y lo solicita para llamarlo
            main(args);
            System.exit(0);
        }
    }
}