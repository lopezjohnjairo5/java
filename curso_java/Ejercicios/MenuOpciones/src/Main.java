import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/*
Creado por JJL
27/05/2024
* */
public class Main {
    public static void main(String[] args) {
        String opcionSeleccionada = "0", menu = "";
        Map<Integer, String> opcionesMenu = new HashMap<Integer, String>();
        opcionesMenu.put(1,"Actualizar");
        opcionesMenu.put(2,"Eliminar");
        opcionesMenu.put(3,"Crear");
        opcionesMenu.put(4,"Listar");
        opcionesMenu.put(5,"salir");

        menu = "\nPor favor seleccione una de las siguientes opciones:\n";
        menu += "\n1 - " + opcionesMenu.get(1) + "\n";
        menu += "2 - " + opcionesMenu.get(2) + "\n";
        menu += "3 - " + opcionesMenu.get(3) + "\n";
        menu += "4 - " + opcionesMenu.get(4) + "\n";
        menu += "5 - " + opcionesMenu.get(5) + "\n";


        do {
            opcionSeleccionada  = JOptionPane.showInputDialog(null,menu + "\nOpcion seleccionada (1,2,3...): ");
            switch (opcionSeleccionada){
                case "1":
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
                    System.out.println("Usuario actualizado correctamente.");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Usuario eliminado con exito.");
                    System.out.println("Usuario eliminado con exito.");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"Nuevo usuario creado.");
                    System.out.println("Nuevo usuario creado.");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null,"El listado de usuarios solo es accesible para superusuarios.");
                    System.out.println("El listado de usuarios solo es accesible para superusuarios.");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null,"Gracias por visitarnos. Vuelva pronto.\n");
                    System.out.println("Gracias por visitarnos. Vuelva pronto.\n");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una de las opciones listadas.\n");
                    System.out.println("Debe seleccionar una de las opciones listadas.\n");
                    break;
            }
        } while (!opcionSeleccionada.equals("5"));

    }
}