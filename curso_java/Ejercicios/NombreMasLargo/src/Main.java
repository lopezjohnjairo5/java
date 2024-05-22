import javax.swing.*;

/*
* creado por JJL
* 22/05/2024
* */
public class Main {
    public static void main(String[] args) {
        String nombreMasLargo = "", nombreCompleto1, nombreCompleto2, nombreCompleto3;
        String[] arrayNombre1 = new String[2], arrayNombre2 = new String[2], arrayNombre3 = new String[2];

        JOptionPane.showMessageDialog(null,"Bienvenido. A continuación introduzca 3 nombres completos:");
        nombreCompleto1 = JOptionPane.showInputDialog("Nombre 1: ").toLowerCase();
        nombreCompleto2 = JOptionPane.showInputDialog("Nombre 2: ").toLowerCase();
        nombreCompleto3 = JOptionPane.showInputDialog("Nombre 3: ").toLowerCase();

        try {
            boolean lanzarExcepcion = nombreCompleto1.isBlank() || nombreCompleto2.isBlank() || nombreCompleto3.isBlank() ? true : false;
            if (lanzarExcepcion){
                throw new Exception("No puede estar vacio.");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
            main(args);
            System.exit(0);
        }

        arrayNombre1 = nombreCompleto1.split(" ");
        arrayNombre2 = nombreCompleto2.split(" ");
        arrayNombre3 = nombreCompleto3.split(" ");

        if (arrayNombre1[0].length() > arrayNombre2[0].length() && arrayNombre1[0].length() > arrayNombre3[0].length()){
            nombreMasLargo = nombreCompleto1;
        } else if (arrayNombre2[0].length() > arrayNombre1[0].length() && arrayNombre2[0].length() > arrayNombre3[0].length()) {
            nombreMasLargo = nombreCompleto2;
        } else if (arrayNombre3[0].length() > arrayNombre1[0].length() && arrayNombre3[0].length() > arrayNombre2[0].length()) {
            nombreMasLargo = nombreCompleto3;
        } else {
            nombreMasLargo = "";
        }

        // si la variable nombreMasLargo esta vacia
        if (nombreMasLargo.equals("") || nombreMasLargo.isBlank()){
            JOptionPane.showMessageDialog(null,"Los 3 nombres tienen la misma longitud");
            System.out.println("Los 3 nombres tienen la misma longitud");
        } else {
            JOptionPane.showMessageDialog(null,nombreMasLargo + " tiene el nombre mas largo.");
            System.out.println( nombreMasLargo + " tiene el nombre mas largo.");
        }

    }
}