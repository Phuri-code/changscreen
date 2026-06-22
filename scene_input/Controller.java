package scene_input;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField input_box;

    @FXML
    private Button save_button;

    @FXML
    void on_save(ActionEvent event) throws Exception {
         System.out.println("hello!");
        var stage = (Stage) save_button.getScene().getWindow();

        var view_main = getClass().getResource("../scene_main/View.fxml");
        // var controller_main = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_main);
        // loader.setController(controller_main);

        // var scene = loader.load();

        var scene = new Scene(loader.load());
        stage.setScene(scene);

        stage.show();

    }

    @FXML
    void initialize() {
        assert input_box != null : "fx:id=\"input_box\" was not injected: check your FXML file 'View.fxml'.";
        assert save_button != null : "fx:id=\"save_button\" was not injected: check your FXML file 'View.fxml'.";

    }

}
