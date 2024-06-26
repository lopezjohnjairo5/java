//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Programacion orientada a objetos POO
        *
        * Busca representar objetos fisicos como entidades
        * logicas, por ejemplo:
        *   - vehiculos : este elemento fisico podria representarse mediante, clases, variables, objetos, etc... en programación
        *
        * CLases:
        *   - puede ser: default(valor por defecto, es cuando NO tiene nada como por ejemplo: class MiClase), public, private, protected
        *   - debe tener el mismo nombre que el archivo.java si es declarada como publica
        *   - se recomienda una clase por archivo (no tener mas de 1 en un mismo archivo)
        *   - atributos (variables de la clase, su scope es a nivel clase), EJ POO: serian los valores generales del obj por ejemplo: color, edad, cantidadPuertas(para el caso de un automovil), etc...
        *   - metodos: equivalente a funciones, pero, al estar en una clase se llaman metodos, serian las acciones que puede representar dicho OBJ como por ejemplo: acelerar, frenar, volar, cantar, etc...
        *   - crear obj o instancia de clase: NombreClase nombre = new NombreClase();, ej: MiAutomovil camaro = new MiAutomovil();
        *   - metodos y atributos de clase deben ser camelCase, ej: miAtributo, miMetodo
        *
        * NOTAS:
        *  - clases utilizan por convencion UpperCamelCase, ej: MiAutomovil
        * */

        // ver ejemplo en SRC
        Automovil bocho = new Automovil("Agregando un msn al constructor de la clase Automovil."); // obj
        Automovil bocho2 = new Automovil("Agregando un msn al constructor de la clase Automovil."); // obj

        bocho.color = Colores.ROJO; // asignando valores, usando clase ENUM Colores
        bocho.marca = "mercedez";
        bocho.setCilindraje(23.5); // asignando mediante setter

        bocho2.color = Colores.VERDE; // asignando valores, usando clase ENUM Colores


        bocho.detalle(); // imprimiendo detalles desde un metodo de la clase Automovil
        bocho2.detalle(); // imprimiendo detalles desde un metodo de la clase Automovil

        System.out.println("\nbocho == bocho2 ?" + (bocho == bocho2)); // comparamos 2 objs aparentemente iguales para saber si realmente lo son
        System.out.println("bocho.equals(bocho2) ?" + (bocho.equals(bocho2))); // comparamos 2 objs aparentemente iguales para saber si realmente lo son
        System.out.println("bocho.color = " + bocho.color);
        System.out.println("bocho.marca = " + bocho.marca);
        System.out.println("bocho.modelo = " + bocho.modelo); // al estar vacio queda null
        System.out.println("bocho.cilindraje = " + bocho.cilindraje);
        System.out.println("bocho.velocidadMax = " + bocho.velocidadMax);
        System.out.println("bocho.getNumPuertas() = " + bocho.getNumPuertas()); //obteniendo valor mediante getter
        System.out.println("bocho.acelerar() = " + bocho.acelerar());

        // usando metodos con sobrecarga
        System.out.println("bocho.calculoConsumo(300km, 0.75%) = " + bocho.calculoConsumo(300, 0.75f) + " de consumo de gasolina"); // invoca el primer metodo - recibe float
        System.out.println("bocho.calculoConsumo(300km, 0.75%) = " + bocho.calculoConsumo(300, 0.75) + " de consumo de gasolina"); // invoca el segundo (el sobreescrito) - recibe double
    }
}