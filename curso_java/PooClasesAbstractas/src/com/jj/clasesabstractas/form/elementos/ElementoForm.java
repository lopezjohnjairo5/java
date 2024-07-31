package com.jj.clasesabstractas.form.elementos;

/*NOTAS:
- toda clase que tenga un metodo abstracto
obliga a que la clase sea abstracta.
- si la clase es abstracta puede o no tener metodos abstractos

 * */

import com.jj.clasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String valor;

    protected String nombre;

    private List<Validador> validadores;

    private List<String> errors;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // metodos abstractos
    public boolean isValid(){
        for (Validador v: this.validadores){
            if(!v.isValid(this.valor)){
                this.errors.add(v.getMsn());
            }
        }
        return this.errors.isEmpty() ? true : false;
    }

    abstract public String printHtml(); // al ser un metodo abstracto no puede tener cuerpo, por lo tanto solo lleva punto y coma al final
}
