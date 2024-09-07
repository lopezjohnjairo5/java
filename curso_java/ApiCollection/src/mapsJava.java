import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapsJava {
    public static void main(String[] args){
        hashMapExample();
    }

    public static void hashMapExample(){
        Map<Integer, String> meses = new HashMap<>();
        Map<Integer,String> abcdario = new HashMap<>();

        // agregando valores
        meses.put(1,"Enero");
        meses.put(2,"Febrero");
        meses.put(3,"Marzo");
        meses.put(4,"Abril");
        meses.put(5,"Mayo");
        meses.put(6,"Junio");
        meses.put(7,"Julio");
        meses.put(8,"Agosto");
        meses.put(9,"Septiembre");
        meses.put(10,"Octubre");
        meses.put(11,"Noviembre");
        meses.put(12,"Diciembre");

        String value = "";
        for (int i = 97; i < 123; i++) {
            value = Character.toString(i);
            abcdario.put(i-96,value);
        }

        System.out.println("meses: " + meses);
        System.out.println("abcdario: " + abcdario);

        // metodos importantes maps
        System.out.println("Obteniendo el valor con clave 3 del map: " + meses.get(3));
        meses.remove(9); // removiendo el valor del map con clave 9
        System.out.println("meses sin septiembre: " + meses);
        System.out.println("valor con clave 16 existe en abcdario " + abcdario.containsKey(16));
        System.out.println("valor con contenido 'f' existe en abcdario " + abcdario.containsValue("f"));

        // reemplazando valores de un map
        abcdario.replace(5,"e","E"); // indice del valor a reemplazar, valor anterior, nuevo valor
        System.out.println("abcdario con E mayuscula: " + abcdario);

        // obteniendo las llaves | claves de un map
        Set<Integer> numeroMeses = meses.keySet();

        for (Integer num: numeroMeses){
            System.out.println("numero de mes = " + num);
        }


    }
}
