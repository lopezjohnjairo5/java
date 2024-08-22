import java.util.List;

/*
* @author: JJL
* fecha: 22/08/2024
* */
public class Main {
    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> lacteosBolsa = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> frutasBolsa = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecedero> noPerecederoBolsa = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> aseoBolsa = new BolsaSupermercado<>();

        // añadiendo lacteos a la bolsa
        lacteosBolsa.addProducto(new Lacteo("Leche",12.500, 12, 23));
        lacteosBolsa.addProducto(new Lacteo("Kumis", 23.000, 2, 250));
        lacteosBolsa.addProducto(new Lacteo("Yogurth", 12.500,123,23));
        lacteosBolsa.addProducto(new Lacteo("Queso", 25.000, 2, 123));

        // añadiendo frutas a la bolsa
        frutasBolsa.addProducto(new Fruta("Melón", 2.500, 2.5, "marron claro"));
        frutasBolsa.addProducto(new Fruta("Banano", 1.200, 1.5, "amarillo"));
        frutasBolsa.addProducto(new Fruta("Aguacate", 5.000, 2.0, "verde"));
        frutasBolsa.addProducto(new Fruta("Manzana", 1.500, 0.7, "rojo"));

        // añadiendo productos no perecederos a la bolsa
        noPerecederoBolsa.addProducto(new NoPerecedero("lentejas", 1.500, 500, 234));
        noPerecederoBolsa.addProducto(new NoPerecedero("atún", 7.500, 250, 123));
        noPerecederoBolsa.addProducto(new NoPerecedero("Azúcar", 2.500, 500, 434));
        noPerecederoBolsa.addProducto(new NoPerecedero("sal", 2.500, 250, 250));

        // añadiendo productos de limpieza
        aseoBolsa.addProducto(new Limpieza("Sanpic",12.500, "benzoato de quien sabe", 2.0));
        aseoBolsa.addProducto(new Limpieza("Jabón polvo", 23.000, "Vinagre y limón", 3.0));
        aseoBolsa.addProducto(new Limpieza("Shampoo", 22.000, "rince, shampoo, otros", 1.0));
        aseoBolsa.addProducto(new Limpieza("crema exfoliante", 30.000, "granulos limpiadores de carbón activado", 0.5));

        // mostrando el contenido de las bolsas
        printBagContent(lacteosBolsa);
        printBagContent(frutasBolsa);
        printBagContent(noPerecederoBolsa);
        printBagContent(aseoBolsa);
    }

    public static void printBagContent (BolsaSupermercado bolsa){

            for (Object f: bolsa.getProductos()){
                System.out.println("------------ Producto " + f.getClass().getName() + "------------\n");
                if (f instanceof Fruta){
                    System.out.println(
                            "Producto: " + ((Fruta) f).getNombre() + "\n" +
                            "Precio: " + ((Fruta) f).getPrecio() + "\n" +
                            "Peso: " + ((Fruta) f).getPeso() + "\n" +
                            "Color: " + ((Fruta) f).getColor() + "\n"
                    );
                } else if (f instanceof Limpieza){
                    System.out.println(
                            "Producto: " + ((Limpieza) f).getNombre() + "\n" +
                            "Precio: " + ((Limpieza) f).getPrecio() + "\n" +
                            "Componentes: " + ((Limpieza) f).getComponentes() + "\n" +
                            "Litros: " + ((Limpieza) f).getLitros() + "\n"
                    );
                } else if (f instanceof Lacteo){
                    System.out.println(
                            "Producto: " + ((Lacteo) f).getNombre() + "\n" +
                            "Precio: " + ((Lacteo) f).getPrecio() + "\n" +
                            "Cantidad: " + ((Lacteo) f).getCantidad() + "\n" +
                            "Proteinas: " + ((Lacteo) f).getProteinas() + "\n"
                    );
                } else if (f instanceof NoPerecedero){
                    System.out.println(
                            "Producto: " + ((NoPerecedero) f).getNombre() + "\n" +
                            "Precio: " + ((NoPerecedero) f).getPrecio() + "\n" +
                            "Calorias: " + ((NoPerecedero) f).getCalorias() + "\n" +
                            "Contenido: " + ((NoPerecedero) f).getContenido() + "\n"
                    );
                }
            }
    }
}