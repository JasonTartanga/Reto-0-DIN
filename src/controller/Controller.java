package controller;

import model.Model;
import view.View;

/**
 * Esta clase es la capa controlador que esta entre las capas de la interfaz de
 * usuario y la logica del negocio.
 *
 * @author Jason, Ian.
 */
public class Controller {

    /**
     * Busca el mensaje ya sea en la base de datos o en el fichero y lo muestra
     * mediante una ventana o la consola.
     *
     * @param model la implementacion del la interfaz del modelo. Puede ser de
     * Fichero o de Base de datos.
     * @param view la implementacion de la interfaz de del usuario. Puede ser
     * mediante una ventana JavaFX o mediante consola.
     */
    public void run(Model model, View view) {
        view.showGreeting(model.getGreeting());
    }
}
