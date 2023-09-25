package vista;

/**
 * Es una implementacion de la interfaz de usuario orientada a consola.
 *
 * @author Jason, Ian.
 */
public class TextImplementation implements View {

    /**
     * Muestra mediante consola el mensaje que se le pasa por parametro.
     *
     * @param greeting el mensaje que se va a mostrar.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
