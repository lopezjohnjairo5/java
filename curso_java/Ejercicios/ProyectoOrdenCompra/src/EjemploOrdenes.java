import java.util.Date;

/*
* @author JJLE
* 2024-06-25
* */
public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Primera orden de compra generada");
        OrdenCompra orden2 = new OrdenCompra("Segunda orden de compra generada");
        OrdenCompra orden3 = new OrdenCompra("Tercera orden de compra generada");

        // clientes
        Cliente cliente1 = new Cliente("Jorge", "Cardenas");
        Cliente cliente2 = new Cliente("Maria", "Martínez");
        Cliente cliente3 = new Cliente("Raul", "López");

        orden1.setCliente(cliente1);
        orden2.setCliente(cliente2);
        orden3.setCliente(cliente3);

        // añadiendo fecha de compra
        Date fechaOrden1 = new Date(124,8,5);
        Date fechaOrden2 = new Date(124,9,7);
        Date fechaOrden3 = new Date(124,10,13);

        orden1.setFecha(fechaOrden1);
        orden2.setFecha(fechaOrden2);
        orden3.setFecha(fechaOrden3);

        // añadiendo productos a las ordenes
        Producto producto1 = new Producto("LG","televisor", 57.5);
        Producto producto2 = new Producto("KALLEY","licuadora", 157.3);
        Producto producto3 = new Producto("SAMSUNG","nevera", 557.89);
        Producto producto4 = new Producto("ACER","computadora", 34.57);

        Producto producto5 = new Producto("HP","impresora", 51.27);
        Producto producto6 = new Producto("SAMGSUNG","celular", 45.7);
        Producto producto7 = new Producto("LENOVO","tablet", 67.87);
        Producto producto8 = new Producto("BUFFALO","billetera", 12.57);

        Producto producto9 = new Producto("BUFALLO","cinturón", 345.57);
        Producto producto10 = new Producto("TOTTO","maleta", 154.57);
        Producto producto11 = new Producto("CORONA","vajilla", 267.57);
        Producto producto12 = new Producto("ELECTROLUX","horno microondas", 234.57);

        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);

        // mostrando el contenido
        // cliente 1
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("\nOrden N° "+orden1.getAutoincremental());
        System.out.println("Cliente: "+orden1.getCliente());
        System.out.println("Fecha orden: "+ orden1.getFecha());
        Producto[] productosOrden1 = orden1.getProductos();
        for (Producto producto: productosOrden1){
            System.out.println("\nProducto: "+producto.getNombre()+"\nFabricante: "+producto.getFabricante()+"\nPrecio: "+producto.getPrecio());
        }
        System.out.println("\nPrecio total: "+orden1.getTotalProducts());

        // cliente 2
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("\nOrden N° "+orden2.getAutoincremental());
        System.out.println("Cliente: "+orden2.getCliente());
        System.out.println("Fecha orden: "+ orden2.getFecha());
        Producto[] productosOrden2 = orden2.getProductos();
        for (Producto producto: productosOrden2){
            System.out.println("\nProducto: "+producto.getNombre()+"\nFabricante: "+producto.getFabricante()+"\nPrecio: "+producto.getPrecio());
        }
        System.out.println("\nPrecio total: "+orden2.getTotalProducts());

        // cliente 3
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("\nOrden N° "+orden3.getAutoincremental());
        System.out.println("Cliente: "+orden3.getCliente());
        System.out.println("Fecha orden: "+ orden3.getFecha());
        Producto[] productosOrden3 = orden3.getProductos();
        for (Producto producto: productosOrden3){
            System.out.println("\nProducto: "+producto.getNombre()+"\nFabricante: "+producto.getFabricante()+"\nPrecio: "+producto.getPrecio());
        }
        System.out.println("\nPrecio total: "+orden3.getTotalProducts());


    }
}