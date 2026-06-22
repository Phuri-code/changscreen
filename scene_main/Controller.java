import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button go_input;

    @FXML
    private Button go_output;

    @FXML
    void on_goinput(ActionEvent event) {
        System.out.println("Input button clicked");
    }

    @FXML
    void on_output(ActionEvent event) {
        System.out.println("Output button clicked");
    }

    @FXML
    void initialize() {
        System.out.println("Controller initialized");
    }
}



















// import java.net.URL;
// import java.util.ResourceBundle;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;

// public class controller {

//     @FXML
//     private ResourceBundle resources;

//     @FXML
//     private URL location;

//     @FXML
//     private Button go_input;

//     @FXML
//     private Button go_output;

//     @FXML
//     void on_goinput(ActionEvent event) {

//     }

//     @FXML
//     void on_output(ActionEvent event) {

//     }

//     @FXML
//     void initialize() {

//     }
// }