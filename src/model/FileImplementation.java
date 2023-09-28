package model;

import java.util.ResourceBundle;

/**
 * La implementacion de la logica del negocio mediante un fichero.
 *
 * @author Jason, Ian.
 */
public class FileImplementation implements Model {

    /**
     * Busca el mensaje que se va a mostrar en un fichero.
     *
     * @return el mensaje que se va a mostrar.
     */
    @Override
    public String getGreeting() {
        return ResourceBundle.getBundle("files.greeting").getString("greeting");
    }
}
