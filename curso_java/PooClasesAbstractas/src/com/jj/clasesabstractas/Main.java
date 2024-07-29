package com.jj.clasesabstractas;
import com.jj.clasesabstractas.form.elementos.*;
import com.jj.clasesabstractas.form.elementos.select.Options;
import java.util.ArrayList;
import java.util.List;
/*
* @author JJL
* 28/07/2024
*
*
* NOTA:
* - una clase abstracta es basicamente una plantilla
* mediante la cual se asegura que las clases que extiendan o hereden de
* esta tendrán una estructura similar (similar no igual, debido a que las clases hijas podrán implementar metodos propios adicionales y diferentes)
* esto Obligará a las clases hijas a tener los mismos metodos abstractos de la clase abstracta padre como obligatorios
* */

public class Main {
    public static void main(String[] args) {

        // creando OBJS del formulario
        InputForm nombreUsuario = new InputForm("userName");
        InputForm passwordUsuario = new InputForm("passwordName", "password");
        InputForm emailUsuario = new InputForm("emailName", "email");
        InputForm edadUsuario = new InputForm("edadName", "edad");

        TextAreaForm experiencia = new TextAreaForm("exp", 30, 30);

        SelectForm lenguajes = new SelectForm("langs");

        // dando valores a los inputs
        nombreUsuario.setValor("John");
        passwordUsuario.setValor("Q12345678");
        emailUsuario.setValor("john@gmail.com");
        edadUsuario.setValor("30");
        experiencia.setValor("5 años de experiencia como programador web en PHP y JS");

        // creando opciones del select
        Options leng1 = new Options("1","Java");
        Options leng2 = new Options("2","Python");
        Options leng3 = new Options("3","C++");
        Options leng4 = new Options("4","Php");
        Options leng5 = new Options("5","Js");

        // añadiendo opciones al select
        leng1.setSelected(true); // poniendo el SELECTED en el lenguaje 1
        lenguajes.addOption(leng1)
                .addOption(leng2)
                .addOption(leng3)
                .addOption(leng4)
                .addOption(leng5);

        // imprimiendo el contenido
        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(nombreUsuario);
        elementos.add(passwordUsuario);
        elementos.add(emailUsuario);
        elementos.add(edadUsuario);
        elementos.add(experiencia);
        elementos.add(lenguajes);

        /* foreach 1
        for (ElementoForm e: elementos){
            System.out.println(e.printHtml());
        }
        */
        // foreach 2
        elementos.forEach(e -> {
            System.out.println(e.printHtml());
        });

        // implementando una clase anonima de la clase abstracta ElementoForm
        ElementoForm anonima = new ElementoForm() {
            @Override
            public String printHtml() {
                return "<input type='text' value = 'Hola mundo desde una implementacion anonima de una clase abstracta'/>";
            }
        };
        System.out.println(anonima.printHtml());
    }
}