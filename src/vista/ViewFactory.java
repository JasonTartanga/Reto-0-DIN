package vista;

import java.util.ResourceBundle;

/**
 * Es la factoria que genera la implementacion de la vista.
 *
 * @author Jason, Ian.
 */
public class ViewFactory {

    /**
     * Dependiendo de el valor view en el fichero de configuracion configApp
     * generara una implementacion de la vista orientada a una ventana JavaFX o
     * hacia consola.
     *
     * @return la implementacion de la vista.
     */
    public static View getView() {
        String viewOpc = ResourceBundle.getBundle("ficheros.configApp").getString("view");

        if (viewOpc.equalsIgnoreCase("view")) {
            return new ViewImplementation();
        } else {
            return new TextImplementation();
        }
    }
}
