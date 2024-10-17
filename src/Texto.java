import javax.swing.*;

/**
 * Clase texto con el texto que ha de introducir el usuario
 * @author cristian
 * @version 1.0
 */
public class Texto {

    //atributo privado de la clase
    private String texto;


    /**
     * Metodo que comparten los hilos para introducir el texto
     */
    public synchronized void setTexto(){
        texto = JOptionPane.showInputDialog("Introduce un texto");
    }

    /**
     * Metodo que devuelve el texto
     * @return el texto
     */
    public String getTexto(){
        return texto;
    }
}
