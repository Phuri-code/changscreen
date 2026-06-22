package scene_input;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    void on_save(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert input_box != null : "fx:id=\"input_box\" was not injected: check your FXML file 'View.fxml'.";
        assert save_button != null : "fx:id=\"save_button\" was not injected: check your FXML file 'View.fxml'.";

    }

}
