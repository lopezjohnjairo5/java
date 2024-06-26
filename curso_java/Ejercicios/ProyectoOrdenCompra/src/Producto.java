/*
 * @author JJLE
 * 2024-06-25
 * */

public class Producto {
    private String fabricante;
    private String nombre;
    private double precio;

    public Producto(String fabricante, String nombre, double precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    /* getters */

    public String getFabricante() {
        return this.fabricante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }



}
