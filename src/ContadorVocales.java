/**
 * Clase con el contador de todas las vocales
 * @author cristian
 * @version 1.0
 */
public class ContadorVocales {

    //iniciamos la variable a 0
    private int totalVocales = 0;

    /**
     * este metodo incrementa el contador de vocales
     */
    public synchronized void aumentaVocales(){
        totalVocales++;
    }

    /**
     * Metodo que nos devuelve el valor de las vocales
     * @return el valor de la vocal
     */
    public int getVocales(){
        return totalVocales;
    }


}
