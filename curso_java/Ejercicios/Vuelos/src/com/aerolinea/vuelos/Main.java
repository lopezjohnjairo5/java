package com.aerolinea.vuelos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
* @author: JJL
* fecha: 07/09/2024
* */


public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat formatD = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        List<Vuelo> listado = new ArrayList<>();
        listado.add(new Vuelo("AAL933","New York", "Santiago", formatD.parse("2021-08-29 05:39:20"), 62));
        listado.add(new Vuelo("LAT755","Sao paulo", "Santiago", formatD.parse("2021-08-31 04:45:00"), 47));
        listado.add(new Vuelo("SKU621","Rio de janeiro", "Santiago", formatD.parse("2021-08-30 16:00:00"), 52));
        listado.add(new Vuelo("DAL147","Atlanta", "Santiago", formatD.parse("2021-08-29 13:22:00"),59));
        listado.add(new Vuelo("AVA241","Bogotá", "Santiago", formatD.parse("2021-08-31 14:05:00"), 25));
        listado.add(new Vuelo("AMX10","Ciudad de méxico","Santiago",formatD.parse("2021-08-31 05:20:00"),29));
        listado.add(new Vuelo("IDE6833","Londres","Santiago",formatD.parse("2021-08-30 08:45:00"), 55));
        listado.add(new Vuelo("LAT2579", "Frankfurt", "Santiago", formatD.parse("2021-08-29 07:41:40"),51));
        listado.add(new Vuelo("SKU803","Lima","Santiago",formatD.parse("2021-08-30 10:35:00"),48));
        listado.add(new Vuelo("LAT533","Los Ángeles", "Santiago", formatD.parse("2021-08-29 09:14:00"),59));
        listado.add(new Vuelo("LAT1447","Guayaquil","Santiago",formatD.parse("2021-08-31 08:33:00"),31));
        listado.add(new Vuelo("CMP111", "Panamá", "Santiago",formatD.parse("2021-08-31 15:15:45"),29));
        listado.add(new Vuelo("LAT501", "París","Santiago",formatD.parse("2021-08-29 18:29:29"), 49));
        listado.add(new Vuelo("LAT405", "Montevideo","Santiago",formatD.parse("2021-08-30 15:45:30"),39));

        listado.sort((a,b) -> a.getFechaLlegada().compareTo(b.getFechaLlegada())); // ordenando por fechas ascendentes

        printListFly(listado);

        System.out.println("El ultimo vuelo en llegar es: " + listado.getLast());

        listado.sort((a,b) -> Integer.compare(b.getCantidadPasajeros(), a.getCantidadPasajeros())); // ordenando numeros enteros a fin de encotnrar el menor
        System.out.println("El vuelo con menor cantidad de pasajeros es: " + listado.getLast());
    }

    public static void printListFly(List<Vuelo> listado){
        System.out.println("nombre \t|\t origen \t|\t destino \t|\t fechaLlegada \t|\t cantidadPasajeros");
        for (Vuelo v: listado){
            System.out.println(v);
        }
    }
}