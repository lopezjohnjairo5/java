import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int miNumero = 0;
        // manejo de errores con try catch
        try {
            // manejo de ventanas de dialogo, inputs, etc...
            String inputValue = JOptionPane.showInputDialog(null,"Introduzca un número entero: ");
            miNumero = Integer.parseInt(inputValue); // JOptionPane requiere de la libreria import javax.swing.*;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: Debe ingresar un número entero.");
            main(args);
            System.exit(0); // para evitar que continue la ejecucion del codigo inferior, de esta forma no salen varias veces el print con valor cero (0)
        }
        System.out.println(miNumero);
    }
}