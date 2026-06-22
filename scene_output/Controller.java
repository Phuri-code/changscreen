import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button closeButton;

    @FXML
    private Label output_data;

    @FXML
    void on_close(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'View.fxml'.";
        assert output_data != null : "fx:id=\"output_data\" was not injected: check your FXML file 'View.fxml'.";

    }

}
