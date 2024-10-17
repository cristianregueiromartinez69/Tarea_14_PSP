import java.text.Normalizer;

/**
 * Clase con el método para eliminar las tildes de un carácter
 * @author cristian
 * @version 1.0
 */
public class MetodoTildes {

    /**
     * Método para eliminar las tildes de un carácter.
     */
    public char eliminarTildes(char vocal) {
        //iniciamos un string que es igual al valor de la vocal,
        String letra = String.valueOf(vocal);

        //iniciamos otro string que va a eliminar la tilde
        String letraSinTilde = Normalizer.normalize(letra, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        //nos devuelve el indice 0 del string
        return letraSinTilde.charAt(0);
    }
}
