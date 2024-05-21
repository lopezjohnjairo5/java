//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String texto = "String creado de forma literal";
        String texto2 = new String("String creado mediante la creacion deun OBJ string");
        Integer num1 = 12;
        Float num3 = 1.9f;

        /*
        * El operador instanceof permite verificar si un objeto
        * pertenece a una clase determinada.
        * También tiene en cuenta la herencia.
        * */
        // validamos el tipo de las variables
        boolean t1 = texto instanceof String; // validamos si el texto es de tipo String
        boolean to = texto instanceof Object;
        boolean t2 = texto2 instanceof String;
        boolean n1 = num1 instanceof Number;
        boolean n3 = num3 instanceof Float; // validamos si el contenido es float

        System.out.println("to es de tipo Object = " + to);
        System.out.println("t1 es de tipo String = " + t1);
        System.out.println("t2 es de tipo String = " + t2);
        System.out.println("n1 es de tipo Number = " + n1);
        System.out.println("n3 es de tipo Float = " + n3);

        // usando operador ternario + InstanceOf
        String resultado =  texto instanceof Object ? "Si es de la clase Objeto" : "No es de la clase Objeto";
        System.out.println("resultado = " + resultado);
    }
}