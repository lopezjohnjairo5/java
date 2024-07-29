package com.jj.clasesabstractas.form.validador;

abstract public class Validador {
    protected String msn;

    abstract public String getMsn();
    abstract public void setMsn(String msn);
    abstract public boolean isValid(String valor);
}
