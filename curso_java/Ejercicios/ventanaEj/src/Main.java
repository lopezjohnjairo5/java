import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*String edad;
        JOptionPane.showMessageDialog(null,"Hola mundo");
        edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        System.out.println("edad = " + edad);*/

        int edad;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Introduzca la edad: ");
        edad = scaner.nextInt();
        System.out.println("edad = " + edad);
    }
}