package controlador;

import modelo.ModelFactory;
import vista.ViewFactory;

/**
 *
 * @author Jason, Ian.
 */
public class Application {

    public static void main(String[] args) {
        new Controller().run(ModelFactory.getModel(), ViewFactory.getView());
    }

}
