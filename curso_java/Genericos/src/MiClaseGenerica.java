import java.util.List;

public class MiClaseGenerica <T> {
    public void printContentList(List<T> listaObj){
        System.out.println("imprimiendo contenido de " + listaObj.getClass().getName());

        for (T obj : listaObj){
            System.out.print(obj+"\t");
        }

        System.out.println();
    }
}
