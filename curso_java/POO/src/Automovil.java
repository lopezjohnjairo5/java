/*
*
* Formas de marcar el archivo
* @author JJLE
* @since 1.0
*
* NOTAS:
* - STATIC indica elemento de CLASE no de objeto, por lo cual los atributos, metodos, etc... marcados como
*           STATIC serán iguales para todos los objs derivados de la clase que los incluye y si se modifican serán modificados de
*           manera global es decir para todos los objetos derivados.
* - para invocar metodos o atributos STATIC se hace uso del NombreClase.metodoAtributoEstatic, si se invoca desde el interior de la misma clase tambien
*           se puede invocar solo con el nombreMetodoAtributoEstatic, NO usar THIS. para estaticos.
* - FINAL indica CONSTANTE y puede ser aplicado a metodos, atributos y clases
* - las clases FINAL no se pueden modificar, no pueden usarse en herencia.
* - los tributos FINAL no se pueden modificar, ni dentro, ni fuera de la clase
* - ENUM es una "clase" de elementos FINAL o CONSTANTES, se escribe con UpperCamelCase. (ver nuevo archivo - clase Colores)
*
* * */

public class Automovil {
    /*
    * Nota:
    * - orden dentro de la clase:
    *   1- atributos de clase
    *   2- constructor(es)
    *   3- metodos setter , getters
    *   4- metodos de clase
    *   5- metodos sobreescritura
    * */
    // atributos
    String marca;
    String modelo;
    Colores color = Colores.AMARILLO; // usando un color de la clase ENUM para definir el valor inicial de la variable color
    String mensaje;

    // al ser int tiene por default el valor cero 0
    private int id; // usado para llevar un control incremental de cada objeto que se cree derivado de esta clase

    // los atributos estaticos pertenecen a la CLASE no al objeto derivado de esta,
    // por lo cual para cambiarlos se usa NombreClase.atributoEstatico = "nuevo valor"
    // (Esto hace que todos los objetos derivados de la clase tengan el mismo valor del atributo
    // estatico, siempre). Al acceder a estos atributos desde el interior de la clase se invoca SIN THIS.
    // o con el nombre de la clase.

    static int cantRuedas;
    private static int cantidadPlazas; // no es accesible desde afuera, salvo que se utilizen metodos getters y setters
    private static int idEstatico;

    // atributos CONSTANTES (final), no se puede cambiar su valor una vez declarado, al ser public pueden ser usados
    // dentro y fuera de la clase, siempre y cuando no se intente cambiar su valor
    public static final int VELOCIDAD_CARRETERA = 120;
    public static final int VELOCIDAD_CIUDAD = 60;

    protected double cilindraje;
    private int numPuertas = 4;
    double velocidadMax = 330;
    float capacidadTanque = 40.0f;

    // creando el constructor de la clase, debe tener el mismo nombre que la clase
    public Automovil(String msn){
        // este es el constructor de la clase, no requiere retorno ya que solo se usa para inicializar valores
        this.mensaje = msn;
        cantRuedas = 4; // este valor será igual para todos los objs derivados de la clase Automovil ya que es un atributo estatico

        //incrementamos el id al crear cada objeto
        this.id = ++idEstatico;
    }

    public Automovil(){
        // este es otro constructor, se puede tener mas de 1, esto se conoce como sobrecarga
        // la idea aqui seria tener un constructor que no requiera parametros y otro que si
        this.mensaje = "este mensaje es automatico ya que este constructor no recibe parametros";
    }

    public Automovil(String marca, String modelo, Colores color, String mensaje, double cilindraje, int numPuertas, double velocidadMax, float capacidadTanque) {
        /*
        * este es otro constructor generado con clic derecho -> generate -> constructor
        * en una clase gracias a la "SOBRECARGA" es posible tener + de 1 constructor
        * esto sirve al crear los objetos derivados de esta clase ya que segun los parametros que se pasen
        * se ejecutará un constructor u otro.
        * */
        // ejemplos invocando constructores desde otro constructor - solo se puede tener una invocacion a un constructor desde otro
        //this(); // invoca al constructor de esta clase que no tiene parametros
        this("otro mensaje"); // invoca al constructor de esta clase que tiene un solo parametro

        // inicializando valores
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.mensaje = mensaje;
        this.cilindraje = cilindraje;
        this.numPuertas = numPuertas;
        this.velocidadMax = velocidadMax;
        this.capacidadTanque = capacidadTanque;

    }

    // tipo retorno nombreMetodo(parametros, argumentos recibidos){ contenido del metodo ... }
    public void setCilindraje(double cilindraje){
        // metodo setter
        this.cilindraje = cilindraje;
    }

    public static void setCantidadPlazas(int cantidadPlazas){
        // metodo setter para un atributo estatico, tambien debe ser static para poder invocarlo
        Automovil.cantidadPlazas = cantidadPlazas;
    }

    public int getNumPuertas() {
        // metodo getter
        return numPuertas; // retornamos el valor de numPuertas
    }

    public static int getCantidadPlazas(){
        // metodo getter para un atributo estatico, tambien debe ser static para poder invocarlo
        return  Automovil.cantidadPlazas;
    }

    public void detalle(){
        String modelo = "otro modelo";

        System.out.println("\nJAVA busca las variables, atributos y demas de adentro hacia afuera, es decir busca desde el metodo actual y va subiendo hasta" +
                "\nencontrarlo por eso se puede omitir el this., sin embargo, si hay mas de 1na variable con el mismo nombre, usará la primera que encuentre, es por eso" +
                "\nque es mejor hacer uso del this. para indicarle al compilador que se hace referencia al atributo de la clase");
        System.out.println("\nID: " + id);
        System.out.println("\nthis.marca = " + this.marca);
        System.out.println("this.modelo = " + this.modelo); // modelo es atributo de la clase
        System.out.println("modelo = " + modelo); // modelo es variable del metodo
        System.out.println("this.color = " + this.color);
        System.out.println("this.getNumPuertas() = " + this.getNumPuertas()); // invocando metodo de la clase
    }

    public String acelerar(){
        return "acelerando a "+ this.velocidadMax + " km/h";
    }

    public float calculoConsumo(int km, float porcentajeGasolina){
        return km /(capacidadTanque * porcentajeGasolina);
    }

    // haciendo sobrecarga o sobre escritura de un metodo, esto permite tener el mismo metodo mas de 1 vez,
    // pero con cambios como: diferente #ro de argumentos, mismos argumentos, pero diferentes tipos, etc...
    public float calculoConsumo(int km, double porcentajeGasolina){
        return (float) (km /(capacidadTanque * (porcentajeGasolina / 100f)));
    }

    public static String miMetodoEstatico(){
        /*
        * En un metodo estatico solo se pueden trabajar con
        * argumetnos pasados por parametro o con atributos estaticos
        * NO se puede trabajar con atributos de clase (this.) ya que el
        * metodo no lo permite
        * */
        String msn = "El vehiculo tiene: " + cantRuedas + " ruedas, y tiene " + Automovil.getCantidadPlazas() + " capacidad maxima"; // uso de atributos estaticos
        return msn;
    }

    @Override
    public boolean equals(Object obj) {
        // metodo de ejemplo de sobreescritura, toma un obj por parametro, lo convierte al tipo de la clase y compara mediante el metodo equals, retornando verdadero o falso
        Automovil a = (Automovil) obj;
        return this.marca.equals(a.marca) && this.modelo.equals(a.modelo) && this.color.equals(a.color);
    }

}
