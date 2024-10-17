/**
 * Clase hilo donde vamos a ejecutar la logica de los hilos
 * @author cristian
 * @version 1.0
 */
public class HilosVocales implements Runnable {


    //atributos privados de la clase
    private Texto texto;
    private char bucasChasr;
    private ContadorVocales contador;
    MetodoTildes metodoTildes = new MetodoTildes();

    /**
     * Constructor de la clase
     * @param texto el texto que va a introducir el usuario
     * @param bucasChasr la letra que tiene que buscar
     * @param contador el contador de todas las vocales
     */
    public HilosVocales(Texto texto, char bucasChasr, ContadorVocales contador) {
        this.texto = texto;
        this.bucasChasr = bucasChasr;
        this.contador = contador;
    }

    @Override
    public void run() {
        //iniciamos el valor del contador de laa vocales a 0
        int vocalesEncontradas = 0;

        //creamos un array de letras con las letras del texto
        char[] chars = texto.getTexto().toCharArray();

        //hacemos un bucle for para recorrer el array
        for (char letra : chars) {
            // Usamos el método para eliminar tildes de los caracteres
            char letraSinTilde = metodoTildes.eliminarTildes(letra);

            //si la letra es una vocal, se suma el contador
            if (letraSinTilde == bucasChasr) {
                vocalesEncontradas++;
                contador.aumentaVocales();
            }
        }

        //imprimimos el resultado
        System.out.println("Número de (" + bucasChasr + ") encontradas: " + vocalesEncontradas);
        System.out.println("Total de vocales: " + contador.getVocales());
    }
}


