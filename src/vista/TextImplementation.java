package vista;

import vista.View;

/**
 *
 * @author Jason, Ian.
 */
public class TextImplementation implements View {

    @Override
    public void showGreating(String greating) {
        System.out.println(greating);
    }

}
