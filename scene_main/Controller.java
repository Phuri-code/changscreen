package scene_main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
    private Label label_data;

    @FXML
    void on_goinput(ActionEvent event) throws Exception {
         System.out.println("hello!");
        var stage = (Stage) go_input.getScene().getWindow();

        var view_input = getClass().getResource("../scene_input/View.fxml");
        // var controller_main = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_input);
        // loader.setController(controller_main);

        // var scene = loader.load();

        var scene = new Scene(loader.load());
        stage.setScene(scene);

        stage.show();
        System.out.println("Input button clicked");
    }

    @FXML
    void on_output(ActionEvent event) throws Exception {
        var stage = (Stage) label_data.getScene().getWindow();

        var view_output = getClass().getResource("../scene_output/View.fxml");
        // var controller_output = new scene_output.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_output);
        // loader.setController(controller_output);
        // var scene = loader.load();

        var scene = new Scene(loader.load());
        stage.setScene(scene);

        stage.show();

        // System.out.println("Output button clicked");
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