package co.jjl.catalogo;

import java.util.Arrays;
import java.util.Date;

/*
* @author JJL
* fecha: 06/08/2024
* */

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] listadoProductos = new IProducto[4];

        listadoProductos[0] = new IPhone(1200000,"apple","15","blanco");
        listadoProductos[1] = new TvLcd(850000,"LG",32);
        listadoProductos[2] = new Libro(35000,new Date(121,3,1),"bobadilla jesus","machine learning y deep learning","RAMA - ediciones de la U");
        listadoProductos[3] = new Comics(50000,new Date(63,3,1),"Stan Lee - Steve Ditko", "Amazing spider-man Vol 1","Marvel comics","Peter parker | hombre araña");

        for (IProducto p: Arrays.asList(listadoProductos)){
            System.out.println(p);
        }
    }
}