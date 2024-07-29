package com.jj.clasesabstractas.form.elementos;

public class InputForm extends ElementoForm{
    private String tipo = "text"; // valor por defecto del input del form

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    // getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // methods
    @Override
    public String printHtml(){
        return "<input type='" + this.tipo
                + "' name='" + this.nombre
                + "' value='" + this.valor + "'>"; // nombre esta en el padre
    }

}
