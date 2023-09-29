package view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Es la implementacion de la vista orientada a una ventana JavaFX.
 *
 * @author Jason, Ian.
 */
public class ViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Label lblgreeting;

    /**
     * Guarda el mensaje que se le pasa por parametro en un array de strings y
     * se abre la ventana JavaFX.
     *
     * @param greeting el mensaje que se va a mostrar.
     */
    @Override
    public void showGreeting(String greeting) {
        String[] args = new String[1];
        args[0] = greeting;
        launch(args);
    }

    /**
     * Genera y muestra una ventana JavaFX con el mensaje que se ha conseguido
     * con el modelo de datos.
     *
     * @param primaryStage la ventana prinicpal.
     * @throws Exception gestiona un error a la hora de abrir la ventana.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
            Parent root = loader.load();

            ViewImplementation viewController = loader.getController();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            viewController.lblgreeting.setText(getParameters().getRaw().get(0));

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
