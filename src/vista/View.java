package vista;

/**
 * La interfaz de la vista.
 *
 * @author Jason, Ian.
 */
public interface View {

    /**
     * Muestra el mensaje ya sea por una ventana JavaFX o por consola.
     *
     * @param greeting el mensaje que se va a mostrar.
     */
    public void showGreeting(String greeting);
}
