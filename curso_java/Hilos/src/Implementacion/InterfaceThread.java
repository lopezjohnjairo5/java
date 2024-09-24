package Implementacion;

public class InterfaceThread implements Runnable{
    /*
    * Usando interfaces para trabajar con hilos
    * Este es el metodo RECOMENDADO ya que no limita a la clase, permitiendo que esta siga implementando o heredando de otras
    *
    * */
    private String nombre;

    public InterfaceThread(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        /*
        * Aqui va el contenido que se ejecutará en el hilo
        * */
        System.out.println("Inicia el hilo "+ getNombre()+"\n");
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10); // pausa para ver como se ejecutan en paralelo varios threads
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " > " + getNombre()); // mostrando una cuenta de cero a 100
        }
        System.out.println("Finaliza el hilo " + getNombre() +"\n");

    }
}
