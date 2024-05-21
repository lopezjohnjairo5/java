import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String finalText = "";

        try {
            finalText += getName() + "_";
            finalText += getName() + "_";
            finalText += getName();
            System.out.println("Resultado: " + finalText);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Se requieren valores de tipo string. Verifique e intente nuevamente.\n ");
            main(args);
        }
    }

    public static String getName(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre de su familiar: \n");
        String nombre = scaner.nextLine();
        String nickName = getNickUser(nombre);
        return nickName;
    }

    public static String getNickUser(String name){
        String nickName = String.valueOf(name.charAt(1));
        nickName = nickName.toUpperCase() + "." + name.substring(name.length() - 2);
        return nickName;
    }
}