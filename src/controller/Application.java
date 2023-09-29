package controller;

import model.ModelFactory;
import view.ViewFactory;

/**
 * Esta es la clase que inicializa la aplicacion.
 *
 * @author Jason, Ian.
 */
public class Application {

    /**
     * Llama al metodo run de la clase controlador y utiliza factorias para
     * conseguir las implementaciones de la vista y del modelo.
     *
     * @param args array de string de parametros.
     */
    public static void main(String[] args) {
        new Controller().run(ModelFactory.getModel(), ViewFactory.getView());
    }

}
