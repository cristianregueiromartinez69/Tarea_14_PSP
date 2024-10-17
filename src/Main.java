/**
 * Clase main donce ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        //instanciamos el objeto texto
        Texto texto = new Texto();
        //introducimos el texto
        texto.setTexto();
        //iniciamos el objeto contador
        ContadorVocales contador = new ContadorVocales();

        //instanciamos los 5 hilos
        Thread hilo1 = new Thread(new HilosVocales(texto, 'a', contador));
        Thread hilo2 = new Thread(new HilosVocales(texto, 'e', contador));
        Thread hilo3 = new Thread(new HilosVocales(texto, 'i', contador));
        Thread hilo4 = new Thread(new HilosVocales(texto, 'o', contador));
        Thread hilo5 = new Thread(new HilosVocales(texto, 'u', contador));

        //arrancamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();



    }
}