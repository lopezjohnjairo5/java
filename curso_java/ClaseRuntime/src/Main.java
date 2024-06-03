public class Main {
    public static void main(String[] args) {
        /*
         * la clase runtime de JAVA permite ejecutar comandos del systema operativo,
         * obtener informacion del sistema, entre otros.
         * */
        Runtime rt = Runtime.getRuntime(); //obtenemos una referencia a la rutina o runtime.
        Process proceso; // usada para albergar el resultado de ejecutar el rt o runtime

        try {
            // verificamos cual es el sistema operativo que se esta utilizando
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad"); // abrimos el editor de texto por defecto de windows
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("textedit"); // abrimos el editor de texto por defecto de MAC
            } else if (System.getProperty("os.name").toLowerCase().startsWith("linux")){
                proceso = rt.exec("gedit"); // abrimos el editor de texto por defecto de linux
            } else {
                proceso = rt.exec("cmd");
            }
            proceso.waitFor(); // esperamos a que se cierre o finalice el comando que se ejecuto, antes de continuar con el programa
        } catch (Exception e) {
            System.err.println("Error al ejecutar el comando.");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
