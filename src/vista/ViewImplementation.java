package vista;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author Jason, Ian.
 */
public class ViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Label lblGreating;

    @Override
    public void showGreating(String greating) {
        String[] args = new String[1];
        args[0] = greating;
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VMain.fxml"));
            Parent root = loader.load();

            ViewImplementation viewController = loader.getController();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            viewController.lblGreating.setText(getParameters().getRaw().get(0));

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
