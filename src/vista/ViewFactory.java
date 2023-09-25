package vista;

import java.util.ResourceBundle;

/**
 *
 * @author Jason, Ian.
 */
public class ViewFactory {

    public static View getView() {
        String viewOpc = ResourceBundle.getBundle("ficheros.configApp").getString("view");

        if (viewOpc.equalsIgnoreCase("view")) {
            return new ViewImplementation();
        } else {
            return new TextImplementation();
        }
    }
}
