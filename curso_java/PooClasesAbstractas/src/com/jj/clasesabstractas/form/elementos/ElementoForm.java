package com.jj.clasesabstractas.form.elementos;

/*NOTAS:
- toda clase que tenga un metodo abstracto
obliga a que la clase sea abstracta.
- si la clase es abstracta puede o no tener metodos abstractos

 * */

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;

    public ElementoForm() {

    }

    public ElementoForm(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // metodos abstractos
    abstract public String printHtml(); // al ser un metodo abstracto no puede tener cuerpo, por lo tanto solo lleva punto y coma al final
}
