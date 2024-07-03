package co.johnlopez.proyectox;

public class Contabilidad {
    public String mensaje = "Esta es la clase de contabilidad.";
    public NoAccesible atributoNA = new NoAccesible();

    public String getMensaje() {
        this.getAtributoNA();
        return mensaje;
    }

    public void getAtributoNA(){
        System.out.println(this.atributoNA.ambito2);
    }
}
