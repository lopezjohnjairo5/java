package Herencia;

public class ExtendThread extends Thread{
    /*
    * clase que hereda de Thread para hacer uso de hilos
    * */

    public ExtendThread(String name) {
        // constructor para ponerle un nombre al hilo, no es necesario pero es util
        super(name);
    }

    @Override
    public void run() {
        /*
         * Aqui va el contenido que se ejecutará en el hilo
         * */
        System.out.println("Inicia el hilo "+ getName() +"\n");
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10); // pausa para ver como se ejecutan en paralelo varios threads
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " > " + getName()); // mostrando una cuenta de cero a 100
        }
        System.out.println("Finaliza el hilo " + getName() +"\n");
    }
}
