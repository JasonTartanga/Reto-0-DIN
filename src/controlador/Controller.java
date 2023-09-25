package controlador;

import modelo.Model;
import vista.View;

/**
 *
 * @author Jason, Ian.
 */
public class Controller {

    public void run(Model model, View view) {

        view.showGreating(model.getGreating());

        /*
        String mensaje = model.getGreating();
        view.showGreating(mensaje);*/
    }
}
