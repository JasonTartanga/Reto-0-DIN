package modelo;

import java.util.ResourceBundle;

/**
 * Es la factoria para el modelo de datos.
 *
 * @author Jason, Ian.
 */
public class ModelFactory {

    /**
     * Dependiendo de el valor model en el fichero de configuracion configApp
     * generara una implementacion del modelo orientada a la base de datos o
     * hacia ficheros.
     *
     * @return una implementacion del modelo de datos.
     */
    public static Model getModel() {
        String modelOpc = ResourceBundle.getBundle("ficheros.configApp").getString("model");

        if (modelOpc.equalsIgnoreCase("database")) {
            return new DBImplementation();
        } else {
            return new FileImplementation();
        }
    }
}
