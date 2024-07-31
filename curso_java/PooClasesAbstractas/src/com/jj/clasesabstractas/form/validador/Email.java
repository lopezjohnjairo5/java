package com.jj.clasesabstractas.form.validador;

public class Email extends Validador{
    protected String msn = "Email incorrecto.";
    //private final static String EMAIL_REGEX = "^[a-zA-Z0-9_-.]{1,}@[a-zA-Z0-9_-.]{2,}.[a-zA-Z0-9_-.]{2,}.[a-zA-Z0-9_-.]*$"; // expresion regular para validar email
    private final static String EMAIL_REGEX = "^(.+)@(.+)$"; // expresion regular para validar email

    @Override
    public String getMsn() {
        return this.msn;
    }

    @Override
    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Override
    public boolean isValid(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
