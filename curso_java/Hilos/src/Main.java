import Herencia.ExtendThread;
import Implementacion.InterfaceThread;

/*
* Los Thread o Hilos
* Son fracciones de codigo que se ejecutan en paralelo, lo que permite ejecutar multiples tareas
* a la vez, por ejemplo se puede ir moviendo un personaje, mientras se van obteniendo valores de una base de datos.
* NOTA: en cada programa siempre hay un proceso como minimo que se ejecuta, el de MAIN, por lo tanto los hilos que se creen
* serán subprocesos de MAIN, si se desea tener presente el hilo principal (MAIN), se debe asociar a una variable, por
* ejemplo Thread main = new Thread.currentThread(); de esta forma el hilo main, podrá ser utilizado como referencia para el resto de los hilos ya sea con
* Join o con Wait
*
* Algunos de sus usos pueden ser:
* - chats como whatsapp
* - videojuegos online multijugador
* - otros
*
* pueden tener varios estados:
* - Runnable = en ejecucion
* - Bloqued = bloqueado, no continua porque algun recurso hace uso de lo que requiere y no tiene acceso
* - Terminated = finalizó la ejecucion
* - Waiting = esta esperando a que algo finalice antes de continuar
*
* El metodo JOIN
* - genera una espera antes de continuar con el resto del codigo,
*   es decir espera a que finalice el hilo marcado con join antes de conitnuar con el resto del codigo, siempre y cuando
*   el resto del codigo no sean otros hilos, de lo contrario estos se ejecutarán comun y corriente.
* - es diferente al sleep debido a que este ultimo solo espera un tiempo
*   determinado y luego continua sin importar si hilo finalizó o no.
*
* El metodo WAIT
*
* Recomendaciones:
* - se recomienda hacer uso de los Threads mediante implementacion (public class InterfaceThread implements Runnable) y
*   no directamente con herencia (public class ExtendThread extends Thread)
*   esto se debe a que al usar herencia se quita la posibilidad a la clase de heredar algun elemento que requiera,
*   mientras que con la implementación seria un agregado a la clase y esto daria mayor fluidez a la hora de trabajar.
* */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // hilo principal
        Thread main = Thread.currentThread(); // creando obj del hilo principal.

        // Threads -> Hilos, mediante herencia
        System.out.println("\n_______________________HERENCIA______________________\n");
        Thread hiloHerencia = new ExtendThread("HiloHerencia");
        Thread hiloHerencia2 = new ExtendThread("HiloHerencia2");

        hiloHerencia.start(); // iniciando el hilo
        hiloHerencia2.start(); // iniciando el hilo
        System.out.println(hiloHerencia.getState()); // mostramos el estado del hilo.

        // Threads -> Hilos, mediante implementacion de interfaces
        System.out.println("\n_______________________INTERFACE______________________\n");
        Thread hiloImplementacion = new Thread(new InterfaceThread("hiloImplementacion"));
        Thread hiloImplementacion2 = new Thread(new InterfaceThread("hiloImplementacion2"));

        hiloImplementacion.start(); // iniciando el hilo
        hiloImplementacion2.start(); // iniciando el hilo
        System.out.println(hiloImplementacion.getState()); // mostramos el estado del hilo.

        // Threads -> Hilos, mediante expresiones lambda
        System.out.println("\n_______________________LAMBDA______________________\n");
        Runnable HiloLambda = new Runnable() {
            @Override
            public void run() {
                /*
                 * Aqui va el contenido que se ejecutará en el hilo
                 * */
                System.out.println("Inicia el hilo " + Thread.currentThread().getName() + "\n");
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(10); // pausa para ver como se ejecutan en paralelo varios threads
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i + " > " + Thread.currentThread().getName()); // mostrando una cuenta de cero a 100
                }
                System.out.println("Finaliza el hilo " + Thread.currentThread().getName() + "\n");

            }

        };

        Runnable HiloLambda2 = new Runnable() {
                @Override
                public void run() {
                    /*
                     * Aqui va el contenido que se ejecutará en el hilo
                     * */
                    System.out.println("Inicia el hilo " + Thread.currentThread().getName() + "\n");
                    for (int i = 0; i <= 100; i++) {
                        try {
                            Thread.sleep(10); // pausa para ver como se ejecutan en paralelo varios threads
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(i + " > " + Thread.currentThread().getName()); // mostrando una cuenta de cero a 100
                    }
                    System.out.println("Finaliza el hilo " + Thread.currentThread().getName() + "\n");

                }
            };

        // ejecutando los hilos creados con expresiones lambda
        new Thread(HiloLambda,"HiloLambda");
        new Thread(HiloLambda2,"HiloLambda");


        // Threads -> Hilos, mediante implementacion de interfaces
        System.out.println("\n_______________________INTERFACE JOIN______________________\n");

        Thread hiloImplementacion3 = new Thread(new InterfaceThread("hiloImplementacion3"));
        Thread hiloImplementacion4 = new Thread(new InterfaceThread("hiloImplementacion4"));
        hiloImplementacion3.start();
        hiloImplementacion4.start();
        hiloImplementacion3.join();
        hiloImplementacion4.join(); // esperando a que finalicen todos los hilos antes de continuar con el resto del codigo del main

        System.out.println("\nEsto se ejecuta al finalizar los hilos con metodo JOIN (hiloImplementacion3, hiloImplementacion4).\n");

    }
}