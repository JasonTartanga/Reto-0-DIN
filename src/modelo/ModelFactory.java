package modelo;

import java.util.ResourceBundle;

/**
 *
 * @author Jason, Ian.
 */
public class ModelFactory {

    public static Model getModel() {
        String modelOpc = ResourceBundle.getBundle("ficheros.configApp").getString("model");

        if (modelOpc.equalsIgnoreCase("database")) {
            return new DBImplementation();
        } else {
            return new FileImplementation();
        }
    }
}
